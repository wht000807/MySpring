package common;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.PropertyValue;
import com.wang.myspring.beans.PropertyValues;
import com.wang.myspring.beans.factory.ConfigurableListableBeanFactory;
import com.wang.myspring.beans.factory.config.BeanDefinition;
import com.wang.myspring.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/03/12:01
 */
public class CustomerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition personBeanDefinition = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = personBeanDefinition.getPropertyValues();
        //将person的name改为ttt
        propertyValues.addPropertyValue(new PropertyValue("name","ttt"));
    }
}
