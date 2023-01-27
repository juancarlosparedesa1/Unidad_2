package com.example.demo.repo;

import com.example.demo.modelo.Representante;

public interface IRepresentanteRepo {
	public void insertar(Representante representante);
	public void actualizar(Representante representante);
	public Representante buscar(Integer id);
	public void elimimar(Integer id);

}
