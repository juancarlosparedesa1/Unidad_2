package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2Jp1Application implements CommandLineRunner{
	
	/*@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IProfesorService iProfesorService;*/
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Jp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 /*Ciudadano ciu = new Ciudadano();
	    ciu.setNombre("Juan ");
	    ciu.setApellido("Paredes");
	    //this.ciudadanoService.guardar(ciu);
	    //this.ciudadanoService.borrar(1);*/
	   
        
        /*ciu.setId(1);
        this.ciudadanoService.modificar(ciu);*/
       
	  
	   /*Empleado empleado = new Empleado();
	    empleado.setSalario(new BigDecimal(1000));
	    empleado.setIngreso(LocalDateTime.now());
	    empleado.setCiudadano(ciu);
	    this.ciudadanoService.guardar(ciu);
	    ciu.setEmpleado(empleado);*/
	    
	    //this.ciudadanoService.borrar(1);
	    //this.empleadoService.agregar(empleado);
	   
	    //this.empleadoService.agregar(empleado);
	    //this.empleadoService.borrar(1);
	    
	    
	    //Segundo ejemplo
	    /*Ciudadano ciud2 = new Ciudadano();
	    ciu2.setNombre("Juan");
	    ciu2.setApellido("Paredes");
	    
	    Empleado empleado2 = new Empleado();
	    empleado2.setSalario(new BigDecimal(200));
	    empleado2.setIngreso(LocalDateTime.now());
	    empleado2.setCiudadano(ciud2);
	    ciu2.setEmpleado(empleado2);*/
	    
	    //this.empleadoService.agregar(empleado2);
	   
		//hotel
		
		Hotel hotel = new Hotel();
		//List<Habitacion > habitaciones = new ArrayList<>();
		List<Habitacion> habitaciones = new ArrayList<>();
		
		hotel.setNombre("paraiso ");
		
		hotel.setDireccion("cdla Ibarra");
		
		Habitacion hab = new Habitacion();
		hab.setNumero("h10");
		//hab.setNumero("h09");
		hab.setHotel(hotel);
		habitaciones.add(hab);
		hotel.setHabitaciones(habitaciones);
		
		this.hotelService.agregar(hotel);
		this.hotelService.borrar(11);
	
		
		hotel.setDireccion("Chillogallo");
		hotel.setId(9);
		this.hotelService.modificar(hotel);
		this.hotelService.encontrar(7);
		
		
	}

}
