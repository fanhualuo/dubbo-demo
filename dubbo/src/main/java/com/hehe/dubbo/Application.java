package com.hehe.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xieqinghe .
 * @date 2018/1/3 下午1:33
 * @email xieqinghe@terminus.io
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class,
                "classpath:provider.xml");
        application.run(args);
        //SpringApplication.run(Application.class, args);
    }
}
