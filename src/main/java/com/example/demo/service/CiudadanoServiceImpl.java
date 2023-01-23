package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.repo.ICiudadanoRepo;



@Service
public class CiudadanoServiceImpl  implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepo ciudadanoRepo;
	
	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.insertar(ciudadano);
	}

	@Override
	public void modificar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.actualizar(ciudadano);
	}

	@Override
	public Ciudadano encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.eliminar(id);;
	}
	

}