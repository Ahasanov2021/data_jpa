package com.example.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.ali.student.Student;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class AliApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliApplication.class, args);
	}


}
