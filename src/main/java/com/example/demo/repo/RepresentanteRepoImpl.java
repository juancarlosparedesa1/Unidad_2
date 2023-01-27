package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Representante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class RepresentanteRepoImpl implements IRepresentanteRepo {

	//punto de conexion con la BD
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Representante representante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(representante);
	}

	@Override
	public void actualizar(Representante representante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(representante);
	}

	@Override
	public Representante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Representante.class, id);
	}

	@Override
	public void elimimar(Integer id) {
		// TODO Auto-generated method stub
		Representante representante=this.buscar(id);
		this.entityManager.remove(representante);
	}

}
