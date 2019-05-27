package ar.edu.unlam.pb2.proyecto;

import java.time.LocalDate;

public class Medico extends Persona {
	private Integer matricula;

	public Medico(String nombre, String apellido, LocalDate nacimiento, Integer edad, Integer dni, Boolean sexo, Integer matricula) {
		super(nombre,apellido, nacimiento,edad,dni,sexo);
		this.matricula = matricula;
		
	}
	
}
