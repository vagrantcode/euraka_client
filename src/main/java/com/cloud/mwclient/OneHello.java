package com.cloud.mwclient;

import com.cloud.mwclient.Bridges.IBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api")
@RestController
public class OneHello implements IBridge {
    @GetMapping("hello")
    public String hello(){
        return  "test1";
    }
}
