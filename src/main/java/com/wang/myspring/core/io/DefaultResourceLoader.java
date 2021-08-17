package com.wang.myspring.core.io;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/21:14
 */
public class DefaultResourceLoader implements ResourceLoader{

    public static final String CLASSPATH_URL_PREFIX = "classpath:";

    @Override
    public Resource getResource(String location) {
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            //classpath下的资源
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        } else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                //当成文件系统下的资源处理
                return new FileSystemResource(location);
            }
        }
    }
}
