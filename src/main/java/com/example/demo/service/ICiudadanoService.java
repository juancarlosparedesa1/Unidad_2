package com.example.demo.service;

import com.example.demo.modelo.Ciudadano;

public interface ICiudadanoService {
	
	public void guardar(Ciudadano ciudadano);
	public void modificar(Ciudadano ciudadano);
	public Ciudadano encontrar(Integer id);
	public void borrar(Integer id);

}
