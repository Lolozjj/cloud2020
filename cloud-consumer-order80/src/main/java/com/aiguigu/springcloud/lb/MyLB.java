package com.aiguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cloud2020
 * @description:
 * @author: Mr.ZhengJunJie
 * @create: 2020-04-03 20:10
 **/
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current=this.atomicInteger.get();
            next=current>=2147483647?0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("#######################"+next);
        return next;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        return null;
    }
}
