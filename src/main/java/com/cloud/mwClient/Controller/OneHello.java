package com.cloud.mwClient.Controller;

import com.cloud.mwClient.Bridges.IBridge;
import com.cloud.mwClient.MybatisPlus.mysqlTables.service.IDeviceTypeService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api")
@RestController
public class OneHello implements IBridge {
    @Autowired
    IDeviceTypeService deviceTypeService;
    @GetMapping("hello")
    public String hello(){
        return  "这是测试客户端提供的接口返回的数据";
    }
    @GetMapping("device")
    public String mybatisTest(){
        return new Gson().toJson(deviceTypeService.list());
    }

}
