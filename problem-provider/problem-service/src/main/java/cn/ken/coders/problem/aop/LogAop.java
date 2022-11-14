package cn.ken.coders.problem.aop;

import cn.ken.coders.problem.util.IpUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/13 20:17
 */
@Aspect
@Component
public class LogAop {
    
    @Pointcut("execution(* cn.ken.coders.problem.service..*.*(*, javax.servlet.http.HttpServletRequest))")
    public void problemLogPointCut() {}

    @After(value = "problemLogPointCut()")
    public void logInsert(JoinPoint jp) {
        Object[] args = jp.getArgs();
        String name = jp.getSignature().getName();
        HttpServletRequest arg = (HttpServletRequest) args[1];
        System.out.println(IpUtil.getIpAddr(arg));
    }
    
    @Before(value = "problemLogPointCut()")
    public void log() {
        System.out.println("hhhhe");
    }
}
