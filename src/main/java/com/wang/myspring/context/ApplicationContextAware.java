package com.wang.myspring.context;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.Aware;

/**
 * @Description: 实现该接口，能感知所属ApplicationContext
 * @Author: wht
 * @Date: 2021/08/04/0:18
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
