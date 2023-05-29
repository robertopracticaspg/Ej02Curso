package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursosService;

@RestController
public class CursoController {
	@Autowired
	CursosService service;

	// FUNCIONA para ver todos los cursos
	// http://localhost:8080/cursos
	@GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> curso() {
		return service.curso();
	}

	// FUNCIONA busca un curso
	// http://localhost:8080/cursos/4444
	@GetMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable int codCurso) {
		return service.buscarCurso(codCurso);
	}

	// FUNCIONA alta curso
	// http://localhost:8080/cursos
	@PostMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	void altaCurso(@RequestBody Curso curso) {
		service.altaCurso(curso);
	}

	////////////////////////////////////////////////////////////////////////////////////////
	// DESPUES DE VARIAS HORAS FUNCIONA!!!!!Ademas no sabia como hacerlo en Postman
	// http://localhost:8080/actualizar_curso/5555
	@PutMapping("/actualizar_curso/{codCurso}")
	public void actualizarDuracion(@PathVariable int codCurso, @RequestBody Curso curso) {
		service.actualizarDuracion(codCurso, curso.getDuracion());
	}

	////////////////////////////////////////////////////////////////////////////////////////

	// FUNCIONA elimiendo el curso que quieras
	// http://localhost:8080/cursos/5555
	@DeleteMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Curso> eliminarCurso(@PathVariable int codCurso) {
		return service.eliminarCurso(codCurso);
	}
	
	//FUNCIONA busca y te muestra los que estan entre los valores que quieres
	//http://localhost:8080/cursos/precio/200/300
	@GetMapping(value = "cursos/precio/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> buscarCursosPorPrecio(@PathVariable int precioMin, @PathVariable int precioMax) {
	    return service.buscarCursosPorPrecio(precioMin, precioMax);
	}

}