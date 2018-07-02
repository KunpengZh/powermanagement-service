package com.xianxian.power;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.xianxian.power.mapper"})
public class PowerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerManagementApplication.class, args);
	}
}
