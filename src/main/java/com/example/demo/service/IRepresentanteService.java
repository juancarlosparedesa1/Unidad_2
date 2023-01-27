package com.example.demo.service;

import com.example.demo.modelo.Representante;

public interface IRepresentanteService {
	public void agregar(Representante representante);

	public void actualizar(Representante representante);

	public Representante encontrar(Integer id);

	public void eliminar(Integer id);
}
