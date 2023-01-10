package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {

	//crud 4 metodos
	//crud basico
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	//CRUD siempre por PK
	public Estudiante buscar(Integer id);
	//CRUD siempre por PK
	public void eliminar(Integer id);
	
	
}
