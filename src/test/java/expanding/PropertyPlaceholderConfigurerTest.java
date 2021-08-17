package expanding;

import bean.Car;
import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/23:10
 */
public class PropertyPlaceholderConfigurerTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:property-placeholder-configurer.xml");

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car.getBrand());
    }
}
