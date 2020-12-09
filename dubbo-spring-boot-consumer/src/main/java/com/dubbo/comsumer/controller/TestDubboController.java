package com.dubbo.comsumer.controller;

import com.dubbo.api.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDubboController {

    @DubboReference
    private IHelloService iHelloService;

    @GetMapping("sayHello")
    public String test1(){
        return iHelloService.sayHello("测试dubbo");
    }
}
