package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Persona> listaAlumnos;

	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @param dni String 9 digitos: 8 numeros y una letra.
	 * @throws Exception: En caso de que el dni no tenga 9 digitos, se lanzara la excepcion.
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @param p, Añade una nueva persona (p) a la lista de alumnos.
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @param dni, String de 9 caracteres, 8 numeros y una letra.
	 * @return Devuelve booleano si el dni introducido esta dentro de la listaAlumnos.
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Constructor, crea una lista para almacenar las personas en el curso.
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @return Devuelve la longitud (numero) de alumnos que tiene un curso.
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
		}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
