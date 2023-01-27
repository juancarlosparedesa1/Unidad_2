package com.example.demo.service;

import com.example.demo.modelo.Curso;

public interface ICursoService {
	public void agregar(Curso curso);

	public void actualizar(Curso curso);

	public Curso encontrar(Integer id);

	public void eliminar(Integer id);
}
