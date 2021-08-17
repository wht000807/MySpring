package service;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.BeanFactory;
import com.wang.myspring.beans.factory.BeanFactoryAware;
import com.wang.myspring.context.ApplicationContext;
import com.wang.myspring.context.ApplicationContextAware;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/19:02
 */
public class HelloService {
//    private ioc.ApplicationContext applicationContext;
//
//    private BeanFactory beanFactory;

    public  String sayHello() {
        System.out.println("hello");
        return "hello";
    }

//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
//    }
//
//    @Override
//    public void setApplicationContext(ioc.ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//
//    public ioc.ApplicationContext getApplicationContext() {
//        return applicationContext;
//    }
//
//    public BeanFactory getBeanFactory() {
//        return beanFactory;
//    }
}
