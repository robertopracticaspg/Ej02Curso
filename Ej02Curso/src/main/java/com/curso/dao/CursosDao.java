package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Curso;

@Repository
public interface CursosDao extends JpaRepository<Curso, Integer> {
	//Estas cueris hay que añadirlas en la capa dao para que funcionen
	@Transactional
	@Modifying
	@Query("UPDATE Curso c SET c.duracion = :nuevaDuracion WHERE c.codCurso = :codCurso")
	void actualizarDuracion( int codCurso, int nuevaDuracion);

	List<Curso> findByPrecioBetween(int precioMin, int precioMax);
}
