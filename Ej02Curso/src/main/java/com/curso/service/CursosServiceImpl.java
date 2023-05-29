package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.curso.dao.CursosDao;
import com.curso.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {
		
	@Autowired	
	CursosDao dao;
	
	@Override
	public List<Curso> curso() {	
		return dao.findAll(); //Toda la lista
	}
	@Override
	public List<Curso> altaCurso(Curso curso) {
		dao.save(curso);
		return dao.findAll();
	}
	
	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		dao.deleteById(codCurso);
		return dao.findAll();
	}
	//DESPUES DE VARIAS HORAS FUNCIONA!!!!!
	@Override
	public void actualizarDuracion(int codCurso, int duracion) {
	    Curso c = buscarCurso(codCurso);
	    if (c != null) {
	        c.setDuracion(duracion);
	        dao.save(c); 
	    }
	}

	@Override
	public Curso buscarCurso(int codCurso) {
		return dao.findById(codCurso).orElse(null);
	}
	@Override
	public List<Curso> buscarCursosPorPrecio(int precioMin, int precioMax) {
	    return dao.findByPrecioBetween(precioMin, precioMax);
	}

    
	

}
