package com.chen.splittable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.chen.splittable.mapper")
public class SplittableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplittableApplication.class, args);
    }

}
