package ioc;

import bean.Car;
import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/0:39
 */
public class PrototypeBeanTest {

    @Test
    public void testPrototype() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:property-bean.xml");

        Car car1 = applicationContext.getBean("car", Car.class);
        Car car2 = applicationContext.getBean("car",Car.class);

        System.out.println(car1 == car2);
    }

}
