package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//metadata especificamente anotaciones
//mapear con un objeto
//establecemos la relacion tabla-objeto java o la representacion
@Entity
@Table(name="estudiante")
public class Estudiante {
	
	//mapear columnas, se mapea como atributos
	//se mapea con tipos clase
	//no importa el orden
	
	//represernta objetos como un objeto de la realidad
	@Id
	@Column(name="estu_id")
	private Integer id;
	
	@Column(name="estu_nombre")
	private String nombre;//estu_nombre error el objeto estudiante tiene un atributo nomcreprivate String apellido;
	
	@Column(name="estu_genero")
	private String genero;
	
	@Column(name="estu_cedula")
	private String cedula;
	
	@Column(name="estu_ciudad")
	private String ciudad;
	
		//pasos Mapeo- hay mas complejos
		//1.tengo que darle informacion para ver a que columna pertenece el atributo ----@Colum(name="")
		//2.tengo que deicrle cual es la primary key--- @Id
		//3.Verificar que todos los imports son de jakarta persinstence
		//4.Generar getters y setters
		//en BD la primary key puede ser dos columnas y la union es la  primary key
	
		//el repository estaba mockeado
		//crud de estudiante
		//
	
	//getters y setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	

}
