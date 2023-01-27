package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Representante;
import com.example.demo.repo.IRepresentanteRepo;

@Service
public class RepresentanteServiceImpl implements IRepresentanteService {

	// inyeccion
	private IRepresentanteRepo empleadoRepo;

	@Override
	public void agregar(Representante representante) {
		// TODO Auto-generated method stub
		this.empleadoRepo.insertar(representante);
	}

	@Override
	public void actualizar(Representante representante) {
		// TODO Auto-generated method stub
		this.empleadoRepo.actualizar(representante);
	}

	@Override
	public Representante encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepo.elimimar(id);
	}

}
