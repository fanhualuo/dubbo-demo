package com.hehe.test2.test1;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hehe.dubbo2.service.AnnotationService;
import lombok.Data;
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
     * 注解配置方式得到service
     */
    @Reference
    AnnotationService annotationService;

    @GetMapping("/demo/test1")
    public String demoTest1() {
        return annotationService.sayHello("xieqinghe_2");
    }

}
