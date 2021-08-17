package com.wang.myspring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 资源的抽象和访问接口
 * @Author: wht
 * @Date: 2021/08/02/21:02
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
