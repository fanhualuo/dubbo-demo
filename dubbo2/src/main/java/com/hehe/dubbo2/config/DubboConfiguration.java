package com.hehe.dubbo2.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * config形式配置公共模块
 * 配置dubbo的service
 * provider
 *
 * @author xieqinghe .
 * @date 2018/1/3 下午1:45
 * @email xieqinghe@terminus.io
 */
@Configuration
public class DubboConfiguration {


    @Bean
    public ApplicationConfig applicationContext() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        // 提供方应用信息，用于计算依赖关系
        applicationConfig.setName("provider-test3");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        //registryConfig.setClient("curator");
        return registryConfig;
    }

}
