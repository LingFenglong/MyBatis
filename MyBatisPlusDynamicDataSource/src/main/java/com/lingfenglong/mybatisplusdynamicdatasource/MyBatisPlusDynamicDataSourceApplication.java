package com.lingfenglong.mybatisplusdynamicdatasource;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lingfenglong.mybatisplusdynamicdatasource.mapper")
public class MyBatisPlusDynamicDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusDynamicDataSourceApplication.class, args);
    }

}
