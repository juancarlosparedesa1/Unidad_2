package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Set<Vehiculo> conjuntoVehiculo = new HashSet<Vehiculo>();
		Set<Cliente> conjuntoCliente = new HashSet<Cliente>();
		
		Vehiculo vh=new Vehiculo();
		vh.setColor("azul");
		vh.setModelo("toyota");
		vh.setPlaca("abc1234");
		vh.setValor(new BigDecimal(3000));
		
		
		Cliente cliente0= new Cliente();
		cliente0.setApellido("paredes");
		cliente0.setNombre("Juan");
		cliente0.setEdad("22");
		cliente0.setFechaNacimiento(LocalDateTime.of(1999, 05, 15, 4, 16));
		cliente0.setVehiculo(conjuntoVehiculo);
		conjuntoCliente.add(cliente0);
		
		Cliente cliente1= new Cliente();
		cliente1.setApellido("Paredes");
		cliente1.setNombre("Luiis");
		cliente1.setEdad("30");
		cliente1.setFechaNacimiento(LocalDateTime.of(1997, 07, 13, 5, 16));
		cliente1.setVehiculo(conjuntoVehiculo);
		conjuntoCliente.add(cliente1);
		
		Cliente cliente2= new Cliente();
		cliente2.setApellido("Paredes");
		cliente2.setNombre("Juan");
		cliente2.setEdad("23");
		cliente2.setFechaNacimiento(LocalDateTime.of(1996, 06, 16, 4, 15));
		cliente2.setVehiculo(conjuntoVehiculo);
		conjuntoCliente.add(cliente2);
		
		Cliente cliente3= new Cliente();
		cliente3.setApellido("vinueza");
		cliente3.setNombre("pepe");
		cliente3.setEdad("20");
		cliente3.setFechaNacimiento(LocalDateTime.of(2002, 05, 15, 4, 17));
		cliente3.setVehiculo(conjuntoVehiculo);
		conjuntoCliente.add(cliente3);
		
		vh.setClientes(conjuntoCliente);
		conjuntoVehiculo.add(vh);
		
		this.iVehiculoService.insertar(vh);
		

		
		
		
		
		
		
		
	
	}

}
