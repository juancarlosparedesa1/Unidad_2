package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Habitacion;
//import com.example.demo.uce.modelo.Hotel;

public interface IHabitacionRepo {

	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void eliminar(Integer id);
}
