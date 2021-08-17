package ioc;

import bean.Car;
import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/17/0:01
 */
public class ValueAnnotationTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:value-annotation.xml");
        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car.getBrand());
    }
}
