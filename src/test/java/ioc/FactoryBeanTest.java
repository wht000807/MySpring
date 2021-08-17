package ioc;

import bean.Car;
import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/0:58
 */
public class FactoryBeanTest {

    @Test
    public void test() throws Exception{
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:factory-bean.xml");

        Car car = applicationContext.getBean("car",Car.class);
        System.out.println(car.getBrand());

    }
}
