package com.hehe.dubbo4.web;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.annotation.Reference;
import com.hehe.dubbo4.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieqinghe .
 * @date 2018/1/3 下午2:23
 * @email xieqinghe@terminus.io
 */
@RestController
public class Test1 {

    /**
     * start注解配置
     */
    @Reference(url = "dubbo://127.0.0.1:20880")
    ApiService apiService;


    @GetMapping("/demo/test1")
    public String demoTest1() {
        return apiService.sayHello("dubbo-4");
    }

}
