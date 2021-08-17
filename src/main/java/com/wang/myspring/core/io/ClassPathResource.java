package com.wang.myspring.core.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: classpath下的资源
 * @Author: wht
 * @Date: 2021/08/02/21:04
 */
public class ClassPathResource implements Resource{

    private final String path;

    public ClassPathResource(String path) {
        this.path = path;
    }


    @Override
    public InputStream getInputStream() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(this.path);
        if (inputStream == null) {
            throw new FileNotFoundException(this.path + "cannot be opened because it dose not exist");
        }
        return inputStream;
    }
}
