package com.nurphy.warehouse;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Administrator
 */
@MapperScan("com.nurphy.warehouse.mapper")
@SpringBootApplication
public class WareHouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareHouseApplication.class,args);
    }
}
