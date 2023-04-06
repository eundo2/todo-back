package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// exclude 주석해제 + 기존거 주석 + websecurityconfig에서 @enablewebsecurity 주석처리 + 새todocontroller에;서 temporary-userid 주석해제
//@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		// 꼬이면 프로젝트 우클릭 gradle>refresh 하고 상단 project>clean
	}

}
