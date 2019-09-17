package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Servicio {

  private @Id @GeneratedValue Long id;
  private String nombre;
  private String codigo;

  Servicio() {}

  Servicio(String nombre, String codigo) {
    this.nombre = codigo;
    this.codigo = codigo;
  }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
}