package common;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/17:01
 */
public class WorldServiceInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Do something before the earth explodes");
        Object result = methodInvocation.proceed();
        System.out.println("Do something after the earth explodes");
        return result;
    }
}
