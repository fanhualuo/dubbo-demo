package com.hehe.test3.test1;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.hehe.dubbo3.service.ApiService;
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
     *api配置方式得到service
     */
    @Autowired
    ReferenceConfig<ApiService> referenceConfig;


    @GetMapping("/demo/test1")
    public String demoTest1() {
        return referenceConfig.get().sayHello("xieqinghe_3");
    }

}
