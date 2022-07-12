package com.cloud.mwClient;

import com.cloud.mwClient.MybatisPlus.MpGenerator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.cloud.mwClient.MybatisPlus.mysqlTables.mapper")
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
        //autoCode();
    }

    /**
     * plus生成器生成数据库代码（需要生成时再调用）
     */
    public static void autoCode() {
        MpGenerator mp = new MpGenerator();
        mp.main(null);
    }

}
