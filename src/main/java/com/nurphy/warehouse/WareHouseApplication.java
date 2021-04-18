package com.nurphy.warehouse;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(basePackages = "com.nurphy.warehouse")
public class WareHouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareHouseApplication.class,args);
    }
}
