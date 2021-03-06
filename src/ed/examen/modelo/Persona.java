package ed.examen.modelo;

/**
 * @author Sergio
 * @version 1.0
 *
 */
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @param dni String, 9 caracteres, 8 numeros y una letra.
	 * @param nombre String
	 * @param apellido1 String
	 * Constructor por Parametros de persona, con dni, nombre y apellido1
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @return Devuleve un String con el Dni.
	 */
	public String getDni() {
		return dni;
	}
	
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @param dni String de 9 caracteres, 8 numeros y una letra.
	 * @throws Exception Cuando formato del dni introducido no se ajusta  las especificaciones. 9 caracteres, 8 numeros y una letra
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @return Devuelve el atributo nombre (String) asociado a la Persona.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @param Asigna el nombre introducido (String) al parametro nombre del objeto persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * @return Devuleve un String con el apellido1 asociado al objeto Persona.
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
