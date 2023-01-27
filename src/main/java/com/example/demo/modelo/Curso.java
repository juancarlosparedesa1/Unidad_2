package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "curso")
public class Curso {
	@Id // pk
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_curso")
	@SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso", allocationSize = 1)
	@Column(name = "curs_id")
	private Integer id;

	@Column(name = "curs_asignatura")
	private String asignatura;

	@Column(name = "curs_duracion")
	private String duracion;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "estu_id_curso")
	private Estudiante estudiante;

	
	//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
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
		return "Curso [id=" + id + ", asignatura=" + asignatura + ", duracion=" + duracion + ", estudiante="
				+ estudiante + "]";
	}

	
	

}
