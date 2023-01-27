package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class CursoRepoImpl implements ICursoRepo {

	//punto de conexion con la BD
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Curso curso) {
		// TODO Auto-generated method stub
		this.entityManager.persist(curso);
	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		this.entityManager.merge(curso);
	}

	@Override
	public Curso buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Curso.class, id);
	}

	@Override
	public void elimimar(Integer id) {
		// TODO Auto-generated method stub
		Curso curso=this.buscar(id);
		this.entityManager.remove(curso);
	}

}
