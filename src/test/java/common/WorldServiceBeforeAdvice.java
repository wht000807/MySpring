package common;

import com.wang.myspring.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/19:51
 */
public class WorldServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("BeforeAdvice: do something before the earth explodes");
    }
}
