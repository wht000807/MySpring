package ioc;

import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import service.HelloService;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/0:24
 */
public class AwareInterfaceTest {

    @Test
    public void test() throws Exception{
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        HelloService  helloService = applicationContext.getBean("helloService",HelloService.class);
//        System.out.println(helloService.getApplicationContext());
//        System.out.println(helloService.getBeanFactory());
    }
}
