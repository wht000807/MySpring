package ioc;

import com.wang.myspring.beans.factory.config.BeanDefinition;
import com.wang.myspring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import service.HelloService;

/**
 * @Description: BeanDefinition和BeanDefinitionRegister测试
 * @Author: wht
 * @Date: 2021/08/02/19:01
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
