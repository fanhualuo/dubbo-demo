package com.hehe.dubbo.service;

import org.springframework.stereotype.Service;

/**
 * 使用xml配置方式
 *
 * @author xieqinghe .
 * @date 2018/1/3 下午2:04
 * @email xieqinghe@terminus.io
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
