package Ejemplo.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Tes {
	
	//Atributo 'numeros' de tipo ArrayList (ArrayList (listado) de tipo Integer)
	//Atributo de tipo ArrayList(Enteros), ya instanciado
	public static ArrayList<Integer> numeros=new ArrayList<>();

	public static void main(String[] args) {
				
		//ArrayList<Integer> numeros=new ArrayList<>(); --> Crea el array 'n�meros' que contiene n�meros enteros
		//ArrayList<String> palabras=new ArrayList<String>(); --> Crea el array 'palabras' que contiene elementos tipo String
		
				
		//se agregan uno tras otro
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		
		//agregar a la posici�n que quiero (1-posici�n 1-,2-el objeto que le quiero agregar-)
		numeros.add(1, 2);
		
		//reemplazar un valor con otro(posici�n con un valor, valor)
		numeros.set(3, 4);
		
		//eliminar un valor (�ndice)
		numeros.remove(3);
		
		//Mostrar elementos por posici�n
		//System.out.println(numeros.get(0));
		//System.out.println(numeros.get(1));

		
		//objeto.size() --> devuelve el tama�o del Array
		
		//Listar todos los elementos
		 for (int i = 0; i < numeros.size(); i++) {
			 System.out.println(numeros.get(i));			
		}

		 

		
		
		
		
		
		
		

	}

}
