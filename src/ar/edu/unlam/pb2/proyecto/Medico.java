package ar.edu.unlam.pb2.proyecto;

import java.time.LocalDate;

public class Medico extends Persona {
	private Integer matricula;

	public Medico(String nombre, String apellido, Integer dia, Integer mes, Integer anio, Integer edad, Integer dni, Boolean sexo, Integer matricula) {
		super(nombre,apellido,  dia, mes,anio,edad,dni,sexo);
		this.matricula = matricula;
		
	}
	
	public Paciente atenderPaciente() {
		return null;
		
	}
	
	public Turno generarTurno() {
		return null;
		
	}
}
