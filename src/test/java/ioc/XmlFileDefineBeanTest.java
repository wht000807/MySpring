package ioc;

import bean.Car;
import bean.Person;
import com.wang.myspring.beans.factory.support.DefaultListableBeanFactory;
import com.wang.myspring.beans.factory.xml.XmlBeanDefinitionReader;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/22:50
 */
public class XmlFileDefineBeanTest {
    @Test
    public void testXmlFile() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
    }
}
