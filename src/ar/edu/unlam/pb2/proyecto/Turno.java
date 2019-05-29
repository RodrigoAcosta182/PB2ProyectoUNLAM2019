package ar.edu.unlam.pb2.proyecto;

import java.time.LocalDate;


public class Turno {
	private Integer codigoTurno;
	private LocalDate fecha;
	private Integer dia;
	private Integer mes;
	private Integer anio;
	
	public Turno() {
		super();
	}



	public Turno(Integer codigoTurno, LocalDate fecha) {
		super();
		this.codigoTurno = codigoTurno;
		this.fecha = fecha;
	}
	
	public void asignarFecha() {
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		
	}
	
}
