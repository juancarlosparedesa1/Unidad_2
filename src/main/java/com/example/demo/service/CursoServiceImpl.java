package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Curso;
import com.example.demo.repo.ICursoRepo;

@Service
public class CursoServiceImpl implements ICursoService {

	// inyeccion
	private ICursoRepo empleadoRepo;

	@Override
	public void agregar(Curso curso) {
		// TODO Auto-generated method stub
		this.empleadoRepo.insertar(curso);
	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		this.empleadoRepo.actualizar(curso);
	}

	@Override
	public Curso encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepo.elimimar(id);
	}

}
