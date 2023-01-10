package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2Jp1Application implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Jp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu= new Estudiante();
		//como se crea una secuencia de bd
		//una secuencia se vincula a la primary key
		//ejmemplo numero de ticket
		//es comun que este atado a la primary key
		//crear secuencias y atarle a la primariy key
		estu.setNombre("juan");
		estu.setCedula("132455544");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		this.estudianteService.agregar(estu);
		
		estu.setCiudad("Guayaquil");
		//this.estudianteService.modificar(estu);
	}

}
