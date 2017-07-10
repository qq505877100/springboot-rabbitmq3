package com.biz;

import com.biz.rabbit.Producer01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringbootRabbitmq3Application {


	//群聊测试
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmq3Application.class, args);
	}
}
