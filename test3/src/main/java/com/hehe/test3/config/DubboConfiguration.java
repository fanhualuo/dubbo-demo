package com.hehe.test3.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.hehe.dubbo3.service.ApiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * config形式配置公共模块
 * 配置dubbo的service
 * consumer
 *
 * @author xieqinghe .
 * @date 2018/1/3 下午1:45
 * @email xieqinghe@terminus.io
 */
@Configuration
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer-test3");
        return applicationConfig;
    }

//    @Bean
//    public ConsumerConfig consumerConfig() {
//        ConsumerConfig consumerConfig = new ConsumerConfig();
//        consumerConfig.setTimeout(3000);
//        return consumerConfig;
//    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }

    /**
     * 注意：ReferenceConfig为重对象，内部封装了与注册中心的连接，以及与服务提供方的连接
     * 引用远程服务
     * 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
     */
    @Bean
    public ReferenceConfig<ApiService> referenceConfig() {
        ReferenceConfig<ApiService> reference = new ReferenceConfig<ApiService>();
        reference.setApplication(applicationConfig());
        // 多个注册中心可以用setRegistries()
        reference.setRegistry(registryConfig());
        reference.setInterface(ApiService.class);
        reference.setVersion("1.0.0");
        return reference;

    }
}
