package com.example.demo.repo;

import com.example.demo.modelo.Curso;

public interface ICursoRepo {
	public void insertar(Curso curso);
	public void actualizar(Curso curso);
	public Curso buscar(Integer id);
	public void elimimar(Integer id);

}
