package com.hehe.dubbo2.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 注解配置方式
 * @Service 为dubbo的注解
 *
 * @author xieqinghe .
 * @date 2018/1/3 下午4:34
 * @email xieqinghe@terminus.io
 */
@Service(timeout = 10000)
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
