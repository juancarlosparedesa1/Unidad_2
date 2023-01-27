package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Curso;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.ICursoService;


@SpringBootApplication
public class Tarea9PaMapeoOneToOneApplication implements CommandLineRunner {

	@Autowired
	private ICursoService cursoService;
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
		Curso curs= new Curso();
//		//empl.setSalario(new BigDecimal(100));
//		ciud.setNombre("juan");
//		ciud.setApellido("paredes");
//		empl.setSalario(new BigDecimal(500));
//		empl.setFechaIngreso(LocalDateTime.now());
//		empl.setCiudadano(ciud);
//		ciud.setEmpleado(empl);
//		this.ciudadanoService.agregar(ciud);
		estu.setNombre("juan");
		estu.setApellido("paredes");
		curs.setAsignatura("Matemáticas");
		curs.setDuracion("6 meses");
		estu.setEstudiante(curs);
		curs.setEstudiante(estu);
		
		//insert
		this.estudianteService.agregar(estu);
		//update
		estu.setNombre("Rodrigo");
		estu.setApellido("mora");
		this.estudianteService.actualizar(estu);
		this.estudianteService.eliminar(1);
		
		
	}

}
