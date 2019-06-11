package ar.edu.unlam.pb2.proyecto;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class EspecialidadTest {

	@Test
	public void TestQueCreaEspecialidades() {
		
		Especialidades esp1 = new Especialidades ("Radiologia", 16);
		Especialidades esp2 = new Especialidades ("Hemoterapia", 19);
		Especialidades esp3 = new Especialidades ("Resonancia", 19);
		
		Set <Especialidades> Especialidad = new HashSet <Especialidades>();
		
		Especialidad.add(esp1);
		Especialidad.add(esp2);
		Especialidad.add(esp3);
		
		assertTrue(esp2.equals(esp3));
		assertFalse(esp1.equals(esp2));		
	}

}
