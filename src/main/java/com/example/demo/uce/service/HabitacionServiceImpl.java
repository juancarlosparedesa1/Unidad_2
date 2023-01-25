package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repository.IHabitacionRepo;
import com.example.demo.uce.repository.IHotelRepo;
@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepo habitacionRepo;
	@Override
	public void crear(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.insertar(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.habitacionRepo.eliminar(id);
	}

}
