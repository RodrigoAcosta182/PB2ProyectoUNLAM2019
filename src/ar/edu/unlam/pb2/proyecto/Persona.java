package ar.edu.unlam.pb2.proyecto;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer dia;
	private Integer mes;
	private Integer anio;
	private Integer edad;
	private Integer dni;
	private Boolean sexo;

	public Persona() {
	}

	public Persona(String nombre, String apellido, Integer dia, Integer mes, Integer anio, Integer edad, Integer dni,
			Boolean sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
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

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
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
		Integer edad;

		LocalDate nacimiento = LocalDate.of(anio, mes, dia);
		LocalDate actual = LocalDate.now();
		Period periodo = Period.between(nacimiento, actual);

		return edad = periodo.getYears();
	}

	public Boolean esMasculino() {
		Boolean sexo = true;
		return sexo;

	}
}
