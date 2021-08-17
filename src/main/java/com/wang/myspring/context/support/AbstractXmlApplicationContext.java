package com.wang.myspring.context.support;

import com.wang.myspring.beans.factory.support.DefaultListableBeanFactory;
import com.wang.myspring.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/03/13:01
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
