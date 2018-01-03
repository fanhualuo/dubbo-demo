package com.hehe.dubbo3.service;

/**
 * api配置方式
 *
 * @author xieqinghe .
 * @date 2018/1/3 下午5:51
 * @email xieqinghe@terminus.io
 */
public class ApiServiceImpl implements ApiService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
