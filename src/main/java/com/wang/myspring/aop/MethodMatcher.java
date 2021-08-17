package com.wang.myspring.aop;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/13:14
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
