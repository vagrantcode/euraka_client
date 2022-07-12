package com.cloud.mwclient.Bridges;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "clientName",path = "/api/")
public interface IBridge {
    @GetMapping("hello")
    public String hello();
}
