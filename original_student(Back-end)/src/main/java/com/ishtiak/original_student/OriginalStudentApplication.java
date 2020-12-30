package com.ishtiak.original_student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.ishtiak.original_student.controller", "com.ishtiak.original_student.service", "com.ishtiak.original_student.repository"})

@SpringBootApplication
public class OriginalStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OriginalStudentApplication.class, args);
	}

}
