package ed.examen.modelo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ed.examen.modelo.Persona;

public class PersonaTest {
	Persona p=new Persona("12345678P","Sergio","Sanz");
	@Test
	public void testPersonaStringStringString() {
		
		String dni="12345678P";
		String nombre="Sergio";
		String apellido1="Sanz";

		assertEquals(dni,p.getDni());
		assertEquals(nombre,p.getNombre());
		assertEquals(apellido1,p.getApellido1());
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
		assertEquals("Sanz",p.getApellido1());
	}

	@Test
	public void testSetApellido1() {
		p.setApellido1("Ramos");
		assertEquals("Ramos",p.getApellido1());
	}

}
