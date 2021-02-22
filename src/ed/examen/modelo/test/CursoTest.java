package ed.examen.modelo.test;


import static org.junit.Assert.*;

import org.junit.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

public class CursoTest {
	Persona p=new Persona("12345678P","Sergio","Sanz");
	
	public Curso c=new Curso();
	@Test
	public void testEliminarAlumno() {
		fail("Not yet implemented");
	}

	@Test
	public void testAniadirAlumno() {
		
		int sizeBefore= c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter =c.numeroAlumnos();
		
		assertEquals(sizeBefore, sizeAfter -1);
	}

	@Test
	public void testEstaRegistrado() {
	
		c.aniadirAlumno(p); //Meto el dni de p alñ añadirlo al curso.
		
		boolean expected=true;
		
		assertEquals(expected, c.estaRegistrado("12345678P"));
		
						
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() {
		int vacio= c.numeroAlumnos();
		c.aniadirAlumno(p);
		int añadiendo1 =c.numeroAlumnos();
		
		assertEquals(vacio, añadiendo1 -1);
	}

}
