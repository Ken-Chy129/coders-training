package cn.ken.coders.problem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/11 17:41
 */
@SpringBootApplication
@MapperScan("cn.ken.coders.problem.mapper")
public class ProblemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProblemServiceApplication.class, args);
    }
}
