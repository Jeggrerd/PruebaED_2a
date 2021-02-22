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
		//Clase valida
		boolean lanzarExcepcion=false; //Booleano falso
		try { //Que funciona bien
			c.eliminarAlumno("12345678P");
		} catch (Exception e) { //Que NO funciona bien
			e.printStackTrace();
			lanzarExcepcion=true; //Paso Booleano a true, lanza la excepcion
		}
		assertFalse(lanzarExcepcion);  //Supongo que mi booleano es false, que hemos coincide que es falso, no me muestra el mensaje.
	}									//En caso de que fuera true, me lanza el mensaje.

	@Test
	public void testAniadirAlumno() {
		
		int sizeBefore= c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter =c.numeroAlumnos();
		
		assertEquals(sizeBefore, sizeAfter -1);
	}

	@Test
	public void testEstaRegistrado() { //Lo subi a la vez que el de numero alumnos.
	
		c.aniadirAlumno(p); //Meto el dni de p alñ añadirlo al curso.
		
		boolean expected=true;
		
		assertEquals(expected, c.estaRegistrado("12345678P"));
		
						
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() { //Lo subi a la vez que esta registrado
		int vacio= c.numeroAlumnos();
		c.aniadirAlumno(p);
		int añadiendo1 =c.numeroAlumnos();
		
		assertEquals(vacio, añadiendo1 -1);
	}

}
