package com.example.demo.modelo;



import org.hibernate.annotations.JavaType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "representante")
public class Representante {
	@Id // pk
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_repres")
	@SequenceGenerator(name = "seq_repres", sequenceName = "seq_repres", allocationSize = 1)
	@Column(name = "cont_id")
	private Integer id;

	@Column(name = "cont_ciudad")
	private String ciudad;

	@Column(name = "cont_telefono")
	private String telefono;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "estu_id_repres")
	private Estudiante estudiante;

	
	//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	//to string
	@Override
	public String toString() {
		return "Representante [id=" + id + ", ciudad=" + ciudad + ", telefono=" + telefono + ", estudiante="
				+ estudiante + "]";
	}

	
	

	
	
	

}
