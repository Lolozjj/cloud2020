package com.aiguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: cloud2020
 * @description:
 * @author: Mr.ZhengJunJie
 * @create: 2020-04-03 20:08
 **/
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
