package ed.examen.modelo.test;


import static org.junit.Assert.*;

import org.junit.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

public class CursoTest {
	Persona p=new Persona("12345678P","Sergio","Sanz");
	Persona s=new Persona("98745632P","Dario","Sanz");
	public Curso c=new Curso();
	@Test
	public void testEliminarAlumno() {
		//Clase valida
		boolean lanzarExcepcion=false; //Booleano falso
		try { //Que funciona bien
			c.eliminarAlumno("12345678P");
		} catch (Exception e) { //Que NO funciona 
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
	public void testEstaRegistrado() { //Lo subi a la vez que el de numeroalumnos.
	
		c.aniadirAlumno(p); //Meto el dni de p alñ añadirlo al curso.
		
		boolean expected=true;
		
		assertEquals(expected, c.estaRegistrado("12345678P"));
		
						
	}

	@Test
	public void testCurso() {
		
		c.aniadirAlumno(p);
		c.aniadirAlumno(s);
		Integer dos=2; //He metido dos alumnos por tanto la lista devolvera 2. Si no funcionara la lista, no podria meter nada dentro.
		assertEquals(dos,c.numeroAlumnos());
		
	}

	@Test
	public void testNumeroAlumnos() { //Lo subi a la vez que estaregistrado
		int vacio= c.numeroAlumnos();
		c.aniadirAlumno(p);
		int añadiendo1 =c.numeroAlumnos();
		
		assertEquals(vacio, añadiendo1 -1);
	}

}
