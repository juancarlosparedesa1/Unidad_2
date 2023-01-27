package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo ciudadanoRepo;

	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.eliminar(id);
	}

}
