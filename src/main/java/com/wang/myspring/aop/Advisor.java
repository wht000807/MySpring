package com.wang.myspring.aop;

import org.aopalliance.aop.Advice;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/19:57
 */
public interface Advisor {


    Advice getAdvice();

}
