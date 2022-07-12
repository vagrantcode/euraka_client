package com.cloud.mwClient.Bridges;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "clientName",path = "/api/")
public interface IBridge {
    @GetMapping("hello")
    public String hello();
}
