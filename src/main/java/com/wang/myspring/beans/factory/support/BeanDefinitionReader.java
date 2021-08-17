package com.wang.myspring.beans.factory.support;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.core.io.Resource;
import com.wang.myspring.core.io.ResourceLoader;

/**
 * @Description: 读取bean定义信息即BeanDefinition的接口
 * @Author: wht
 * @Date: 2021/08/02/22:12
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String[] locations) throws BeansException;
}
