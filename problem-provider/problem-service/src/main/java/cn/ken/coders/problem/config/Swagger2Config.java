package cn.ken.coders.problem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/11 17:56
 */
@Configuration
@EnableSwagger2 // 开启Swagger2自动配置
public class Swagger2Config {

    @Bean(value = "dockerBean")
    public Docket dockerBean() {
        //指定使用Swagger2规范
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        //描述字段支持Markdown语法
                        .description("# Knife4j RESTful APIs")
                        .termsOfServiceUrl("https://doc.xiaominfo.com/")
                        .contact(new Contact("ken", "www.ken-chy129.cn", "1294967895@qq.com"))
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("题目服务")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("cn.ken.coders.problem.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

}
