package com.wang.myspring.context.support;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/03/12:45
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    /**
     * 创建beanFactory并加载BeanDefinition
     * @throws BeansException
     */
    protected final void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    /**
     * 创建bean工厂
     * @return
     */
    protected DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    /**
     * 加载BeanDefinition
     * @param beanFactory
     * @throws BeansException
     */
   protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException;

   public DefaultListableBeanFactory getBeanFactory() {
       return beanFactory;
   }

}
