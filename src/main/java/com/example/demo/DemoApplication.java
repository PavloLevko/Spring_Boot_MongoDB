package com.example.demo;

import com.example.demo.entity.Address;
import com.example.demo.entity.Gender;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository){
		return args -> {
			Address newYork = new Address("USA", "New-York", "234234234");
			User userDoe = new User("Jon",
					"Doe",
					"jondoe@gmail.com",
					List.of("books","computer"),
					Gender.MALE,
					newYork,
					LocalDateTime.now()
			);
			repository.insert(userDoe);
		};
	}
}
