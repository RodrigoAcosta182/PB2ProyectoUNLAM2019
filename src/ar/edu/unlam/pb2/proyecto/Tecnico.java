package ar.edu.unlam.pb2.proyecto;

import java.time.LocalDate;

public class Tecnico extends Persona {
	private String especialidad;

	public Tecnico(String nombre, String apellido, Integer dia, Integer mes, Integer anio, Integer edad, Integer dni,
			Boolean sexo, String especialidad) {
		super(nombre, apellido, dia, mes, anio, edad, dni, sexo);
		this.especialidad = especialidad;

	}
}
