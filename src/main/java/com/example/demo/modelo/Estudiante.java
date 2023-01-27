package com.example.demo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity // entidades
@Table(name = "estudiante")
public class Estudiante {
	@Id // Primarykey
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estudiante")
	@SequenceGenerator(name = "Seq_estudiante", sequenceName = "seq_estudiante", allocationSize = 1)

	@Column(name = "estu_id")
	private Integer id;

	@Column(name = "estu_nombre")
	private String nombre;

	@Column(name = "estu_apellido")
	private String apellido;

	// mapeo de unao a uno
	@OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL) //
	private Curso estudiante;

	
	//getters and setters
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

	public Curso getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Curso estudiante) {
		this.estudiante = estudiante;
	}

	// to string
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estudiante=" + estudiante
				+ "]";
	}

	
	

	
}
