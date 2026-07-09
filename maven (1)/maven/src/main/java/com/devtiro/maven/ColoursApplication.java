package com.devtiro.maven;

import com.devtiro.maven.services.ColourPrinter;
import com.devtiro.maven.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public ColoursApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColoursApplication.class, args);
	}

	public void run(final String... args){
		log.info(colourPrinter.print());
	}
}
