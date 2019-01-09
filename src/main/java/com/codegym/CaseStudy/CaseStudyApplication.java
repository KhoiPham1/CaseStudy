package com.codegym.CaseStudy;

import com.codegym.CaseStudy.service.NoteManagementService;
import com.codegym.CaseStudy.service.impl.NoteManagementServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CaseStudyApplication {


	public static void main(String[] args) {
		SpringApplication.run(CaseStudyApplication.class, args);
	}
	@Bean
	public NoteManagementService noteManagementService(){return new NoteManagementServiceImpl() ;}

}

