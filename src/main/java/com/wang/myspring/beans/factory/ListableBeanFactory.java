package com.wang.myspring.beans.factory;

import com.wang.myspring.beans.BeansException;

import java.util.Map;

/**
 * @Description: 该接口定义了访问容器中 Bean 基本信息的若干方法
 * @Author: wht
 * @Date: 2021/08/02/22:02
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 返回指定类型所有实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String,T> getBeansOfType(Class<T> type) throws BeansException;


    /**
     * 返回定义的所有bean的名称
     */
    String[] getBeanDefinitionNames();

}
