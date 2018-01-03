package com.hehe.dubbo3.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.hehe.dubbo3.service.ApiService;
import com.hehe.dubbo3.service.ApiServiceImpl;
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


    /**
     * 服务实现
     */
    @Bean
    public ApiService apiService() {
        return new ApiServiceImpl();
    }

    /**
     * 当前应用配置
     */
    @Bean
    public ApplicationConfig applicationContext() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        // 提供方应用信息，用于计算依赖关系
        applicationConfig.setName("provider-test3");
        return applicationConfig;
    }

    /**
     * 连接注册中心配置
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }

    /**
     * 服务提供者协议配置
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(28800);
        protocol.setThreads(200);
        return protocol;
    }


    /**
     * 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口
     * 服务提供者暴露服务配置
     * 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
     */
    @Bean
    public ServiceConfig<ApiService> serviceConfig() {
        ServiceConfig<ApiService> service = new ServiceConfig<ApiService>();
        service.setApplication(applicationContext());
        // 多个注册中心可以用setRegistries()
        service.setRegistry(registryConfig());
        // 多个协议可以用setProtocols()
        service.setProtocol(protocolConfig());
        service.setInterface(ApiService.class);
        service.setRef(apiService());
        service.setVersion("1.0.0");

        // 暴露及注册服务
        service.export();

        return service;
    }

}
