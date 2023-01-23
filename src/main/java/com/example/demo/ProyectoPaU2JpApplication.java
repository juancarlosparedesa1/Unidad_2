package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Empleado;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;



@SpringBootApplication
public class ProyectoPaU2JpApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JpApplication.class, args);
	}
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  Ciudadano ciu = new Ciudadano();
		    ciu.setNombre("Juan ");
		    ciu.setApellido("Paredes");
		    this.ciudadanoService.guardar(ciu);
		    //this.ciudadanoService.borrar(8);
		   
	        
	        /*ciu.setId(14);
	        this.ciudadanoService.modificar(ciu);*/
	       
		    //System.out.println(this.ciudadanoService.encontrar(7));
		    Empleado empleado = new Empleado();
		    empleado.setSalario(new BigDecimal(300));
		    empleado.setIngreso(LocalDateTime.now());
		    empleado.setCiudadano(ciu);
		    ciu.setEmpleado(empleado);
		    this.empleadoService.agregar(empleado);
		    
		    
	}

}
