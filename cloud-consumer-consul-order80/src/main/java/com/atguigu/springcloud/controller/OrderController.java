package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
//    public static final String PAYMENT_URL="http://localhost:8001"; 单机的
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

   @GetMapping(value = "/consumer/consul")
    public String paymentInfo(){
       return restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
   }

}
