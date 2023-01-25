package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2Jp1Application implements CommandLineRunner {

	/*
	 * @Autowired private IEstudianteService estudianteService;
	 * 
	 * @Autowired private IProfesorService iProfesorService;
	 * 
	 * @Autowired private ICiudadanoService ciudadanoService;
	 * 
	 * @Autowired private IEmpleadoService empleadoService;
	 */

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Jp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Ciudadano ciu = new Ciudadano(); ciu.setNombre("Juan ");
		 * ciu.setApellido("Paredes"); //this.ciudadanoService.guardar(ciu);
		 * //this.ciudadanoService.borrar(1);
		 */

		/*
		 * ciu.setId(1); this.ciudadanoService.modificar(ciu);
		 */

		/*
		 * Empleado empleado = new Empleado(); empleado.setSalario(new
		 * BigDecimal(1000)); empleado.setIngreso(LocalDateTime.now());
		 * empleado.setCiudadano(ciu); this.ciudadanoService.guardar(ciu);
		 * ciu.setEmpleado(empleado);
		 */

		// this.ciudadanoService.borrar(1);
		// this.empleadoService.agregar(empleado);

		// this.empleadoService.agregar(empleado);
		// this.empleadoService.borrar(1);

		// Segundo ejemplo
		/*
		 * Ciudadano ciud2 = new Ciudadano(); ciu2.setNombre("Juan");
		 * ciu2.setApellido("Paredes");
		 * 
		 * Empleado empleado2 = new Empleado(); empleado2.setSalario(new
		 * BigDecimal(200)); empleado2.setIngreso(LocalDateTime.now());
		 * empleado2.setCiudadano(ciud2); ciu2.setEmpleado(empleado2);
		 */

		// this.empleadoService.agregar(empleado2);

		// hotel
		// 1 bucar hotel
		// 2 crear habitacion agregar habitacion
		// set(hotel)
		// crear el insert
		// 3 guardar

//		Hotel hotel = new Hotel();
//		//List<Habitacion > habitaciones = new ArrayList<>();
//		List<Habitacion> habitaciones = new ArrayList<>();
//		
//		hotel.setNombre("paraiso ");
//		
//		hotel.setDireccion("cdla Ibarra");
//		
//		Habitacion hab = new Habitacion();
//		hab.setNumero("h10");
//		//hab.setNumero("h09");
//		hab.setHotel(hotel);
//		habitaciones.add(hab);
//		hotel.setHabitaciones(habitaciones);
//		
//		this.hotelService.agregar(hotel);
//		this.hotelService.borrar(11);
//	
//		hotel.setDireccion("Chillogallo");
//		hotel.setId(9);
//		this.hotelService.modificar(hotel);
//		
//		//1
//		this.hotelService.encontrar(7);

		// habitacion
		// 2

		// this.habitacionService.crear(hab);
		// this.habitacionService.
		// en casacada cuando persisto borro, en habitacion persistiendo
		// cascade merge:propagar en cascada cuando se actualice
		// si elimino una habitacion no debe afectar
		// consultar el hotel,consultan un hotel por su id e imprimir las habitaciones

		Hotel miHotel = new Hotel();
		miHotel.setNombre("B");
		miHotel.setDireccion("jfk");
//		 List<Habitacion> miListaHabitaciones = new ArrayList<Habitacion>(); 
		List<Habitacion> miListaHabiaciones = new ArrayList<Habitacion>();
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setNumero("1");
		habitacion1.setHotel(miHotel);
		miListaHabiaciones.add(habitacion1);
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setNumero("2");
		habitacion2.setHotel(miHotel);
		miListaHabiaciones.add(habitacion1);
		Habitacion habitacion3 = new Habitacion();
		habitacion1.setNumero("3");
		habitacion1.setHotel(miHotel);
		miListaHabiaciones.add(habitacion3);
		Habitacion habitacion4 = new Habitacion();
		habitacion1.setNumero("4");
		habitacion1.setHotel(miHotel);
		miListaHabiaciones.add(habitacion4);
		miHotel.setHabitaciones(miListaHabiaciones);
		// Guardar hotel y habitacion// 
		// this.iHotelService.guardar(miHotel);
		// this.iHo
//	Busqueda
//	Hotel hotelbus = this.iHotelService.encontrar(6);//// // Actualizo//
//	hotelbus.setNombre("HotelBus");//
//	this.iHotelService.actualizar(hotelbus);////// Borrar//
//	this.iHotelService.eliminar(6); //
//	Habitacion habitacion7 = new Habitacion();//
//	habitacion7.setNumero("7");//
//	habitacion7.setHotel(miHotel);//
//	miListaHabitaciones.add(habitacion7);////
//	this.iHabitacionService.guardar(habitacion7); //
//	Hotel hotelo = this.iHotelService.encontrar(7);////
//	Habitacion habitacion8 = new Habitacion();//
//	habitacion8.setNumero("8");
//	habitacion8.setHotel(hotelo);//
//	miListaHabitaciones.add(habitacion8);////
//	this.iHabitacionService.guardar(habitacion8);  //
//	Habitacion habitoide = this.iHabitacionService.encontrar(47); // Consultar el hotel por id e imprimir todas las
//	habitaciones.Hotel hotelo = this.iHotelService.encontrar(7);
//	for(
//	Habitacion habitacion:hotelo.getHabitaciones())
//
//	{
//		System.out.println(habitacion);
//	}

	}

//starckoverflow desbordamiento de memoria
//strin de hote listhabitaciones
//1)habitacion
//habitacion esta imprimiendo el hotel
//quitar la impresion del hotel del to string 
//cuando utilizo lazy: no me traiga todas las relaciones
//accediendo a la lista, pero no en cualquier parte
//En la consulta de hotel de repository
//.size -EAGER-LAZY
//SE PUEDE HACER SOLAMENTE EN EL REPOSITORY
}
