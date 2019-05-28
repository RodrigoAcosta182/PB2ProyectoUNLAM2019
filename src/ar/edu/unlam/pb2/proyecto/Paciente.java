package ar.edu.unlam.pb2.proyecto;

import java.time.LocalDate;

public class Paciente extends Persona {
	

	public Paciente(String nombre, String apellido, Integer dia, Integer mes, Integer anio, Integer edad, Integer dni,
			Boolean sexo) {
		super(nombre, apellido, dia, mes, anio, edad, dni, sexo);

	}
}
