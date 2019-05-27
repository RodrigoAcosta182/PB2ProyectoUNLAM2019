package ar.edu.unlam.pb2.proyecto;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate nacimiento;
	private Integer edad;
	private Integer dni;
	private Boolean sexo;

	public Persona() {
	}

	public Persona(String nombre, String apellido, LocalDate nacimiento, Integer edad, Integer dni, Boolean sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
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
		apellido = apellido;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	public Integer calcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.nacimiento, hoy);
		this.edad = periodo.getYears();
		return this.edad;
	}

}
