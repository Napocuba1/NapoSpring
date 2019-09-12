package com.example.demo;

	import lombok.extern.slf4j.Slf4j;

	import org.springframework.boot.CommandLineRunner;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
import org.springframework.core.log.LogDelegateFactory;

import jdk.internal.org.jline.utils.Log;

public class Data {
	
	

	  @Bean
	  CommandLineRunner initDatabase(ServicioRepository repository) {
	    return args -> {
	    		      Log.info("Preloading " + repository.save(new Servicio("Bilbo Baggins", "burglar")));
	      Log.info("Preloading " + repository.save(new Servicio("Frodo Baggins", "thief")));
	    };
	  }
	}

