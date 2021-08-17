package ioc;

import cn.hutool.core.io.IoUtil;
import com.wang.myspring.core.io.DefaultResourceLoader;
import com.wang.myspring.core.io.Resource;
import org.junit.Test;


import java.io.InputStream;

/**
 * @Description: 资源和资源加载器测试
 * @Author: wht
 * @Date: 2021/08/02/21:18
 */
public class ResourceAndResourceLoaderTest {

    @Test
    public void testResourceLoader() throws Exception{
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();

        //加载classpath下的资源
        Resource resource = resourceLoader.getResource("classpath:hello.txt");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);

        //加载文件系统资源
        resource = resourceLoader.getResource("src/test/resources/hello.txt");
        inputStream = resource.getInputStream();
        content = IoUtil.readUtf8(inputStream);
        System.out.println(content);

        //加载url资源
        resource = resourceLoader.getResource("https://www.baidu.com");
        inputStream = resource.getInputStream();
        content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
}
