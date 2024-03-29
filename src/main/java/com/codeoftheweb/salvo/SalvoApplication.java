package com.codeoftheweb.salvo;

import com.codeoftheweb.salvo.models.Player;
import com.codeoftheweb.salvo.repository.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PlayerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Player("Jack"));
			repository.save(new Player("Chloe"));
			repository.save(new Player("Kim"));
			repository.save(new Player("David"));
			repository.save(new Player("Michelle"));
		};
	}
}
