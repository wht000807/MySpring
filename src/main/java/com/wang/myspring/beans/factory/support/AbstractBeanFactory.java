package com.wang.myspring.beans.factory.support;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.FactoryBean;
import com.wang.myspring.beans.factory.config.BeanDefinition;
import com.wang.myspring.beans.factory.config.BeanPostProcessor;
import com.wang.myspring.beans.factory.config.ConfigurableBeanFactory;
import com.wang.myspring.util.StringValueResolver;

import java.util.*;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/17:24
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    private final List<BeanPostProcessor> beanPostProcessors = new LinkedList<>();
    private final Map<String, Object> factoryBeanObjectCache = new HashMap<>();
    private final List<StringValueResolver> embeddedValueResolvers = new ArrayList<StringValueResolver>();

    @Override
     public Object getBean(String beanName) throws BeansException {
        Object sharedInstance = getSingleton(beanName);
        if (sharedInstance != null) {
            //如果是FactoryBean,从FactoryBean的getObject中创建bean
            return getObjectForBeanInstance(sharedInstance, beanName);
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        Object bean = createBean(beanName, beanDefinition);
        return getObjectForBeanInstance(bean, beanName);
    }

    /**
     * 如果是FactoryBean，从FactoryBean#getObject中创建bean
     * @param beanInstance
     * @param beanName
     * @return
     */
    protected Object getObjectForBeanInstance(Object beanInstance, String beanName) {
        Object object = beanInstance;
        if (beanInstance instanceof FactoryBean) {
            FactoryBean factoryBean = (FactoryBean) beanInstance;
            try {
                if (factoryBean.isSingleton()) {
                    //singleton作用域bean,从缓存获取
                    object = this.factoryBeanObjectCache.get(beanName);
                    if (object == null) {
                            object = factoryBean.getObject();
                            this.factoryBeanObjectCache.put(beanName, object);
                    } else {
                        //prototype作用域bean,新创建bean
                        object = factoryBean.getObject();
                    }
                }
            } catch (Exception e) {
                throw new BeansException("FactoryBean threw exception on object[" + beanName + "] creation", e);
            }
        }
        return object;
    }


    @Override
    public <T> T getBean(String name,Class<T> requiredType) throws BeansException {
        return ((T) getBean(name));
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        //有则覆盖
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

    public void addEmbeddedValueResolver(StringValueResolver valueResolver) {
        this.embeddedValueResolvers.add(valueResolver);
    }

    public String resolveEmbeddedValue(String value) {
        String result = value;
        for (StringValueResolver resolver : this.embeddedValueResolvers) {
            result = resolver.resolveStringValue(result);
        }
        return result;
    }

}
