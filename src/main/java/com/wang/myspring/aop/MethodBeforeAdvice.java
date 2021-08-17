package com.wang.myspring.aop;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/19:42
 */
public interface MethodBeforeAdvice extends BeforeAdvice{
    void before(Method method, Object[] args,Object target) throws Throwable;
}
