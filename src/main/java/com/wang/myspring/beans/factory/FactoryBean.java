package com.wang.myspring.beans.factory;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/0:45
 */
public interface FactoryBean<T>{

    T getObject() throws Exception;

    boolean isSingleton();

}
