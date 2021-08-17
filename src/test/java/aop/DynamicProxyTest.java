package aop;

import com.wang.myspring.aop.AdvisedSupport;
import com.wang.myspring.aop.ClassFilter;
import com.wang.myspring.aop.MethodMatcher;
import com.wang.myspring.aop.TargetSource;
import com.wang.myspring.aop.aspectj.AspectJExpressionPointcut;
import com.wang.myspring.aop.aspectj.AspectJExpressionPointcutAdvisor;
import com.wang.myspring.aop.framework.ProxyFactory;
import com.wang.myspring.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import common.WorldServiceBeforeAdvice;
import common.WorldServiceInterceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;
import service.WorldService;
import service.WorldServiceImpl;

/**
 * @Description: JDK动态代理是
 * @Author: wht
 * @Date: 2021/08/16/16:55
 */
public class DynamicProxyTest {

    private AdvisedSupport advisedSupport;

    @Before
    public void test() throws Exception{
        WorldService worldService = new WorldServiceImpl();

        advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(worldService);
        WorldServiceInterceptor worldServiceInterceptor = new WorldServiceInterceptor();
        MethodMatcher methodMatcher = new AspectJExpressionPointcut("execution(* service.WorldService.explode(..))");
        advisedSupport.setTargetSource(targetSource);
        advisedSupport.setMethodInterceptor(worldServiceInterceptor);
        advisedSupport.setMethodMatcher(methodMatcher);

    }

    @Test
    public void testJdkDynamicProxy() throws Exception {
//        WorldService proxy = (WorldService) new JdkDynamicAopProxy(advisedSupport).getProxy();
//        proxy.explode();

        //使用JDK动态代理
        WorldService proxy = (WorldService) new ProxyFactory(advisedSupport).getProxy();
        proxy.explode();
    }

    @Test
    public void testCglibDynamicProxy() throws Exception {
//        WorldService proxy = (WorldService) new CglibAopProxy(advisedSupport).getProxy();
//        proxy.explode();

        advisedSupport.setProxyTargetClass(true);
        WorldService proxy = (WorldService) new ProxyFactory(advisedSupport).getProxy();
        proxy.explode();
    }

    @Test
    public void testBeforeAdvice() throws Exception {
        //设置BeforeAdvice
        WorldServiceBeforeAdvice beforeAdvice = new WorldServiceBeforeAdvice();
        MethodBeforeAdviceInterceptor methodInterceptor = new MethodBeforeAdviceInterceptor(beforeAdvice);
        advisedSupport.setMethodInterceptor(methodInterceptor);

        WorldService proxy = (WorldService) new ProxyFactory(advisedSupport).getProxy();
        proxy.explode();
    }

    @Test
    public void testAdvisor() throws Exception {
        WorldService worldService = new WorldServiceImpl();

        //Advisor是Pointcut和Advice的组合
        String expression = "execution(* service.WorldService.explode(..))";
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(expression);
        MethodBeforeAdviceInterceptor methodInterceptor = new MethodBeforeAdviceInterceptor(new WorldServiceBeforeAdvice());
        advisor.setAdvice(methodInterceptor);

        ClassFilter classFilter = advisor.getPointcut().getClassFilter();
        if (classFilter.matches(worldService.getClass())) {
            AdvisedSupport advisedSupport = new AdvisedSupport();

            TargetSource targetSource = new TargetSource(worldService);
            advisedSupport.setTargetSource(targetSource);
            advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
            advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());
//			advisedSupport.setProxyTargetClass(true);   //JDK or CGLIB

            WorldService proxy = (WorldService) new ProxyFactory(advisedSupport).getProxy();
            proxy.explode();
        }
    }



}
