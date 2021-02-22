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
		fail("Not yet implemented");
	}

	@Test
	public void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNombre() {
		fail("Not yet implemented");
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
