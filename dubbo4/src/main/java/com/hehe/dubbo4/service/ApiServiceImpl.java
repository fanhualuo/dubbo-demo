package com.hehe.dubbo4.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author xieqinghe .
 * @date 2018/3/21 下午5:41
 * @email xieqinghe@terminus.io
 */
@Service(interfaceClass = ApiService.class)
@Component
public class ApiServiceImpl implements ApiService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
