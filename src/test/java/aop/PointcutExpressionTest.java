package aop;

import com.wang.myspring.aop.aspectj.AspectJExpressionPointcut;
import org.junit.Test;
import service.HelloService;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/13:25
 */
public class PointcutExpressionTest {
    @Test
    public void test() throws NoSuchMethodException {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* service.HelloService.*(..))");
        Class<HelloService> clazz = HelloService.class;
        Method method = clazz.getDeclaredMethod("sayHello");

        System.out.println(pointcut.matches(clazz));
        System.out.println(pointcut.matches(method,clazz));
    }
}
