package com.example.demo;

public class ServicioNotFoundException  extends RuntimeException{


	  ServicioNotFoundException(Long id) {
	    super("Could not find Servisio " + id);
	  }
	}
