package ioc;

import bean.Car;
import bean.Person;
import com.wang.myspring.beans.factory.support.BeanDefinitionReader;
import com.wang.myspring.beans.factory.support.DefaultListableBeanFactory;
import com.wang.myspring.beans.factory.xml.XmlBeanDefinitionReader;
import common.CustomerBeanFactoryPostProcessor;
import common.CustomerBeanPostProcessor;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/03/11:53
 */
public class BeanFactoryPostProcessorAndBeanPostProcessorTest {

    @Test
    public void testBeanFactoryPostProcessor() throws Exception{
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //在所有BeanDefinition加载完成后，但在bean实例化之前，修改BeanDefinition的属性值
        CustomerBeanFactoryPostProcessor beanFactoryPostProcessor = new CustomerBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testBeanPostProcessor() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //添加bean实例化后的处理器
        CustomerBeanPostProcessor customerBeanPostProcessor = new CustomerBeanPostProcessor();
        beanFactory.addBeanPostProcessor(customerBeanPostProcessor);

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
    }
}
