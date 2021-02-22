package ed.examen.modelo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

public class CursoTest {

	public Curso c=new Curso();
	@Test
	public void testEliminarAlumno() {
		fail("Not yet implemented");
	}

	@Test
	public void testAniadirAlumno() {
		Persona p=new Persona("12345678P","Sergio","Sanz");
		int sizeBefore= c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter =c.numeroAlumnos();
		
		assertEquals(sizeBefore, sizeAfter -1);
	}

	@Test
	public void testEstaRegistrado() {
		
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
