package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//metadata especificamente anotaciones
//mapear con un objeto
//establecemos la relacion tabla-objeto java o la representacion
@Entity
@Table(name = "estudiante")
public class Estudiante {

	// mapear columnas, se mapea como atributos
	// se mapea con tipos clase
	// no importa el orden

	// represernta objetos como un objeto de la realidad
	@Id
	// secuencias
	// @SequenceGenerator(name="estu_seq",sequenceName"estu_seq",allocationSize =1);
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="estu_seq");
//	@SequenceGenerator(name="estu_seq",sequenceName"estu_seq",allocationSize =1);
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "estu_seq", sequenceName = "estu_seq", allocationSize = 1)
	@Column(name = "estu_id")
	private Integer id;

	@Column(name = "estu_nombre")
	private String nombre;// estu_nombre error el objeto estudiante tiene un atributo nomcreprivate String
							// apellido;

	@Column(name = "estu_apellido")
	private String apellido;// estu_nombre error el objeto estudiante tiene un atributo nomcreprivate String
							// apellido;

	@Column(name = "estu_genero")
	private String genero;

	@Column(name = "estu_cedula")
	private String cedula;

	@Column(name = "estu_ciudad")
	private String ciudad;

	@Column(name = "estu_pais")
	private String pais;

	@Column(name = "estu_salario")
	private BigDecimal salario;

	@Column(name = "estu_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;

	// pasos Mapeo- hay mas complejos
	// 1.tengo que darle informacion para ver a que columna pertenece el atributo
	// ----@Colum(name="")
	// 2.tengo que deicrle cual es la primary key--- @Id
	// 3.Verificar que todos los imports son de jakarta persinstence
	// 4.Generar getters y setters
	// en BD la primary key puede ser dos columnas y la union es la primary key

	// el repository estaba mockeado
	// crud de estudiante
	//

	// getters y setters

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getId() {
		return id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
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
