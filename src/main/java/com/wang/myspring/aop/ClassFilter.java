package com.wang.myspring.aop;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/13:14
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
