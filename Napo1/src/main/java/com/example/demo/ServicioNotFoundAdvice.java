package com.example.demo;
import org.springframework.http.HttpStatus;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.ResponseStatus;

	@ControllerAdvice
public class ServicioNotFoundAdvice {
	
	
	

	  @ResponseBody
	  @ExceptionHandler(ServicioNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String employeeNotFoundHandler(ServicioNotFoundException ex) {
	    return ex.getMessage();
	  }
	}

