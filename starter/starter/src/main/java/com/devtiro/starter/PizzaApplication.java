package com.devtiro.starter;

import com.devtiro.starter.config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PizzaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
	}

	PizzaConfig pizzaConfig;

	PizzaApplication(PizzaConfig pizzaConfig){
		this.pizzaConfig = pizzaConfig;
	}
	@Override
	public void run(String... args) {

		log.info(
				String.format("I want a %s crust pizza with %s and %s sauce.",
				pizzaConfig.getCrust(),
				pizzaConfig.getTopping(),
				pizzaConfig.getSauce()
		));
	}
}
