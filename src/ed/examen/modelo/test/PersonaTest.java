package ed.examen.modelo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ed.examen.modelo.Persona;

public class PersonaTest {
	Persona p=new Persona("12345678P","Sergio","Sanz");
	@Test
	public void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDni() {
		assertEquals("12345678P",p.getDni());
	}

	@Test
	public void testSetDni() {
		//Clase Valida
		try {			
			p.setDni("14785236Q");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		assertEquals ("14785236Q",p.getDni());
		//Clase invalida
		boolean lanzarExcepcion=false;
		try {
			p.setDni("147852369");
		} catch (Exception e) {
			e.printStackTrace();
			lanzarExcepcion=true;
		}
		
		assertTrue(lanzarExcepcion);
	}
	


	@Test
	public void testGetNombre() {
		assertEquals("Sergio",p.getNombre());
	}

	@Test
	public void testSetNombre() {
		p.setNombre("Dario");
		assertEquals("Dario",p.getNombre());
		
	}

	@Test
	public void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetApellido1() {
		fail("Not yet implemented");
	}

}
