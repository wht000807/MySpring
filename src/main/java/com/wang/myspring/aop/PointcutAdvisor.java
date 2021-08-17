package com.wang.myspring.aop;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/19:57
 */
public interface PointcutAdvisor extends Advisor{

    PointCut getPointcut();
}
