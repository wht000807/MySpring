package com.wang.myspring.context.event;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.BeanFactory;
import com.wang.myspring.beans.factory.BeanFactoryAware;
import com.wang.myspring.context.ApplicationEvent;
import com.wang.myspring.context.ApplicationListener;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/11:01
 */
public abstract class AbstractApplicationEventMulticaster implements ApplicationEventMulticaster, BeanFactoryAware {

    public final Set<ApplicationListener<ApplicationEvent>> applicationListeners = new HashSet<>();

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void addApplicationListener(ApplicationListener<?> listener) {
        applicationListeners.add((ApplicationListener<ApplicationEvent>) listener);
    }

    @Override
    public void removeApplicationListener(ApplicationListener<?> listener) {
        applicationListeners.remove(listener);
    }
}
