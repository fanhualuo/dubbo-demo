package com.hehe.test3;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xieqinghe .
 * @date 2018/1/3 下午1:33
 * @email xieqinghe@terminus.io
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.hehe.test3")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
