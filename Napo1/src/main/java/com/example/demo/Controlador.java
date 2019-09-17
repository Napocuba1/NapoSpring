package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {

  private final ServicioRepository repository;

  EmployeeController(ServicioRepository repository) {
    this.repository = repository;
  }

  // Aggregate root

  @GetMapping("/Servicio")
  List<Servicio> all() {
    return repository.findAll();
  }

  @PostMapping("/Servicio")
  Servicio newServicio(@RequestBody Servicio newServicio) {
    return repository.save(newServicio);
  }

  // Single item

  @GetMapping("/Servicios/{id}")
  Servicio one(@PathVariable Long id) {

    return repository.findById(id)
      .orElseThrow();
  }

  @PutMapping("/Servicio/{id}")
  Servicio replaceServicio(@RequestBody Servicio newServicio, @PathVariable Long id) {

    return repository.findById(id)
      .map(Servicio -> {
    	  Servicio.setNombre(newServicio.getNombre());
    	  Servicio.setId(newServicio.getId());
        return repository.save(Servicio);
      })
      .orElseGet(() -> {
        newServicio.setId(id);
        return repository.save(newServicio);
      });
  }

  @DeleteMapping("/Servicio/{id}")
  void deleteEmployee(@PathVariable Long id) {
    repository.deleteById(id);
  }
}