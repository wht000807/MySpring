package com.wang.myspring.aop;

/**
 * @Description: 切点抽象
 * @Author: wht
 * @Date: 2021/08/04/13:15
 */
public interface PointCut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
