package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.repository.ILibroRepo;
import com.example.demo.uce.service.IAutorService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelSService;
	@Autowired
	private IHabitacionService habitacionService;
	@Autowired
	private IAutorService autorService;
	@Autowired
	private ILibroRepo iLibroRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Hotel hotel = this.hotelSService.consulta(1);
//
//		for (Habitacion a : hotel.getHabitaciones()) {
//			System.out.println(a);
//		}
//
//		Habitacion habitacion = new Habitacion();
//		habitacion.setHotel(hotel);
//		habitacion.setNumero("4");
//
//		//this.habitacionService.guardar(habitacion);
//
//		// this.habitacionService.borrar(11);
		
//		Libro libro1 = new Libro();
//		libro1.setNombre("P.web");
//		libro1.setEditorial("editorial1");
//		
//		Libro libro2 = new Libro();
//		libro2.setNombre("Redes");
//		libro2.setEditorial("editorial2");
//		Autor autor1 = new Autor();
//		autor1.setNombre("ws");
//		
		
		Set<Libro> conjuntoLibros = new HashSet<Libro>();
		Set<Autor> conjuntoAutores = new HashSet<Autor>();
		Autor ew = new Autor();
		ew.setNombre("ws");
		
		Libro pWeb= new Libro();
		pWeb.setNombre("pWeb");
		pWeb.setEditorial("Editorial 1");
		pWeb.setAutores(conjuntoAutores);
		conjuntoLibros.add(pWeb);
		
		Libro redes= new Libro();
		redes.setNombre("redes");
		redes.setEditorial("Editorial 1");
		redes.setAutores(conjuntoAutores);
		conjuntoLibros.add(redes);
		ew.setLibros(conjuntoLibros);
		conjuntoAutores.add(ew);
		this.autorService.insertar(ew);
		
		//consulta 2
		
		
		
		
		
		
	
	}

}
