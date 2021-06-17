package Ejemplo.Array2;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

	//Atributo 'contactos' de tipo ArrayList (de tipo 'Persona')
	private ArrayList<Persona>contactos;


	// con el constructor instancia la clase ArrayList para  generar el Array de objetos ('contactos') de tipo 'Persona'
	//instancia el ArrayList y lo guarda en 'contactos'
	public Agenda() {
		contactos = new ArrayList<>();
	}

	//agrega un elemento al ArrayList
	public void agregarContacto(String nombre, String telefono) {
		Persona persona = this.buscar(nombre);
		if (persona!=null) {
			System.out.println("El contacto " + nombre + " ya existe con el teléfono " + persona.getNumeroTelefonico());			
		}else {
			this.contactos.add(new Persona (nombre, telefono));
	}
	}

	//agregar por posicion
	public void agregarContacto(int posicion, String nombre, String telefono) {
			this.contactos.add(posicion, new Persona (nombre, telefono));			
		}	
	

	public int cantidadContactos() {
		return this.contactos.size();
	}

	public void mostrarForTradicional() {
		for (int i = 0; i <this.cantidadContactos();i++) {
			System.out.println(contactos.get(i));
		}
	}

	//for each. Define la variable 'persona' de tipo Persona. Itera 'contactos' y a cada uno lo guarda dentro de 'persona'
	public void mostrar() {
		System.out.println("\nListado de contactos\n");
		for(Persona persona: contactos) {
			System.out.println(persona);
		}
	}
	//borrar por posicion
	public void borrar(int posicion) {
		this.contactos.remove(posicion);		
	}

	//borra por búsqueda de objeto
	public void borrar(String nombre) {

		Persona persona=this.buscar(nombre);

		if (persona==null) {
			System.out.println(nombre + " no encontrado");
		}
		else{
			this.contactos.remove(this.buscar(nombre));
			System.out.println(nombre + " borrado");
		}				
	}

	//búsqueda
	public Persona buscar (String nombre) {
		Persona persona=null;
		int index=0;
		while (persona==null && index <this.cantidadContactos()) {
			if (this.contactos.get(index).getNombre().equals(nombre)) {
				persona = this.contactos.get(index);				
			}
			index++;
		}
		return persona;
	}


	public void reemplazar(int index, Persona persona) {
		System.out.println("Reemplazando a: " + this.contactos.get(index) + " por " + persona + "\n");
		this.contactos.set(index, persona);
	}
	
		
	public void reemplazarTelefono(String nombre, String telefono) {
		Persona persona = this.buscar(nombre);
		
		System.out.println("Reemplazando a " + nombre + " con el teléfono " + telefono);
		if (persona==null) {
			System.out.println("No encontrado");			
		}else {
			persona.setNumeroTelefonico(telefono);
		}
	}
	
	public void llamar(String nombre, Fecha fecha) {
		Persona persona= this.buscar(nombre);
		if (persona!=null) {
			persona.agregarLlamada(fecha);			
		}
	}
	
	public void mostrarLlamadas(String nombre) {
		Persona persona=this.buscar(nombre);
		if (persona!=null) {
			System.out.println("Listado de llamadas a " + nombre);
			for (Fecha fecha : persona.getLlamadas()) {
				System.out.println(fecha);				
			}			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
