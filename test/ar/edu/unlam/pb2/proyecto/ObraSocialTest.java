package ar.edu.unlam.pb2.proyecto;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ObraSocialTest {

	@Test

	public void TestQueCreaObrasSociales() {

		ObraSocial Obra1 = new ObraSocial("Osde", "298625");
		ObraSocial Obra2 = new ObraSocial("Swiss Medical", "6958");
		ObraSocial Obra3 = new ObraSocial("Osecac", "59852");
		ObraSocial Obra4 = new ObraSocial("Osdepym", "98632");
		ObraSocial Obra5 = new ObraSocial("sarasa", "98632"); // repetido

		Set<ObraSocial> Obras = new HashSet<ObraSocial>();
		Obras.add(Obra1);
		Obras.add(Obra2);
		Obras.add(Obra3);
		Obras.add(Obra4);

		assertTrue(Obra4.equals(Obra5));

	}
}
