package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Representante;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IRepresentanteService;


@SpringBootApplication
public class Tarea9PaMapeoOneToOneApplication implements CommandLineRunner {

	@Autowired
	private IRepresentanteService representanteService;
	@Autowired
	private IEstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea9PaMapeoOneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//creamos un ciudadano y un empleado
		Estudiante estu = new Estudiante();
		Representante represent= new Representante();

		estu.setNombre("juan");
		estu.setApellido("paredes");
		represent.setCiudad("Quito");
		represent.setTelefono("0995083032");
		
		//insert
		this.estudianteService.agregar(estu);
		//update
		estu.setNombre("Rodrigo");
		estu.setApellido("mora");
		this.estudianteService.actualizar(estu);
		this.estudianteService.eliminar(1);
		
		
	}

}
