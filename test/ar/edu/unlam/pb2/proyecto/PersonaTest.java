package ar.edu.unlam.pb2.proyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void testCalcularEdad() {
		Persona miPersona = new Persona("Jorge", "Lopetegui",11,4,1991, 28, 38562147, true);
		assertEquals(28, miPersona.calcularEdad(),0.0);
	}

}
