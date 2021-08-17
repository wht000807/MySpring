package ioc;

import bean.Car;
import bean.Person;
import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/03/13:09
 */
public class ApplicationContext {

    @Test
    public void testApplicationContext() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Person person = applicationContext.getBean("person",Person.class);
        System.out.println(person);

        Car car = applicationContext.getBean("car",Car.class);
        System.out.println(car);
    }
}
