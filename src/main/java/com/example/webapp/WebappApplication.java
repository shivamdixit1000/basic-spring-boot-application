package com.example.webapp;

import com.example.webapp.model.Author;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);

		Author author = new Author("shivam", "dixit");
		Author author1 = null;
		Author author2 = null;
		System.out.println(author1.equals(author2));


	}
}
