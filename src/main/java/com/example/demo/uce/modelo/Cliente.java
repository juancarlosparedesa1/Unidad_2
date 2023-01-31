package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cli_seq")
	@SequenceGenerator(name = "cli_seq", sequenceName = "cli_seq", allocationSize = 1)
	@Column(name = "cli_id")
	private Integer id;
	@Column(name = "cli_nombre")
	private String nombre;
	@Column(name = "cli_apellido")
	private String apellido;
	@Column(name = "cli_edad")
	private String edad;
	@Column(name = "cli_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@ManyToMany
	@JoinTable(name="cliente_vehiculo",joinColumns = @JoinColumn(name="clivehi_id_vehiculo"),inverseJoinColumns =@JoinColumn())//con que columna va  a ser join la columna FK de libro
	private Set<Vehiculo> vehiculo;//muchos a muchos

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Set<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Set<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
