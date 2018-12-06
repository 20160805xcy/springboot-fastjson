package com.xcy.springbootfastjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.xcy.springbootfastjson.mapper"})
public class SpringbootFastjsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFastjsonApplication.class, args);
    }
}
