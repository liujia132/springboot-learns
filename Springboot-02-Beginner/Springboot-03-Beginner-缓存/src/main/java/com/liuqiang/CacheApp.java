package com.liuqiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//开启缓存
@EnableCaching
@SpringBootApplication
public class CacheApp {
    public static void main(String[] args) {

        SpringApplication.run(CacheApp.class,args);
    }
}
