package Ejemplo.Array;

import java.util.ArrayList;

public class Curso {
		
	//Objetos de tipo 'Nota' 
	//Atributo privado 'notas' de tipo ArrayList, Array de tipo Nota	
	private ArrayList<Nota> notas;
	private int cantidadAlumnos;
		
	//En el constructor se instancia el Array
	public Curso(int cantidadAlumnos) {
		notas= new ArrayList<>();
		this.cantidadAlumnos=cantidadAlumnos;
	}	
	
	public void agregar(String nombre, int nota) {		
		//llama al otro método
		this.agregar(nombre, nota, null);
	}
	
	public void agregar(String nombre, int nota, String telefono) {		
		//validar para que agregue la cantidad de objetos que tiene el Array
		if (this.notas.size()<this.cantidadAlumnos) {
			//no agrega un repetido, si la nota es null (no existe) y lo agrega
			//Nota notaObjeto= this.buscar(nombre);
			if (this.buscar(nombre)==null) {
				notas.add(new Nota(nombre, nota, telefono));
			}							
		}		
	}
	
	public void mostrarNotas() {
		//foreach
		//itera el arrayList de 'notas'(azul), por cada iteración guarda todos los objetos en la variable 'nota'(marron) que es de tipo 'Nota' 
		for (Nota nota : this.notas) {
			System.out.println(nota);			
		}		
	}
	
	
	public Nota buscar(String nombre) {
		Nota nota=null;
		int index=0;
		//busca en un array con while. mientras la nota sea null y el index menor al size,trae del index el nombre y lo compara con el del parámetro
		//devuelve el objeto entero
		while (nota==null &&index<this.notas.size()) {
		if (this.notas.get(index).getNombre().equals(nombre)) {
			nota=this.notas.get(index);			
		}	
		index++;			
		}
		return nota;		
	}
	
	//borra el objeto que se pasa por parámetro
	public void borrar(String nombre) {
		this.notas.remove(this.buscar(nombre));		
	}
	
	public int borrarPorNota(int notaBorrar) {
		int cantidad=0;
		//lo hace con 'for' y no con 'while' porque quiere borrar TODAS las notas que encuentre, no solo una.
		//con 'while' solo borra la primera que encuentre
		for (int i = 0; i < this.notas.size(); i++) {
			if (this.notas.get(i).getNota()==notaBorrar) {
				this.notas.remove(i);		
				cantidad++;
			}			
		}
			return cantidad;	
		}
		
	
	public double obtenerPromedio() {
		double sumaNotas=0;
		for(Nota nota:this.notas) {
			sumaNotas+=nota.getNota();
		}
		return sumaNotas/this.notas.size();
		}
	 
	

}
