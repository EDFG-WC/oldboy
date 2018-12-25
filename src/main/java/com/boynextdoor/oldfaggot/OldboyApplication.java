package com.boynextdoor.oldfaggot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//扫描mapper文件的注解
@MapperScan("com.boynextdoor.oldfaggot.mapper")
@EnableTransactionManagement
public class OldboyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OldboyApplication.class, args);
	}
}
