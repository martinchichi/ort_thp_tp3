package Ejemplo.Array;

public class Test2 {

	public static void main(String[] args) {

		Curso curso=new Curso(4);
		
		curso.agregar("Juan", 10,"112233");
		curso.agregar("Juan", 10,"112233");
		curso.agregar("Pedro", 8);
		curso.agregar("Jose", 6);
		curso.agregar("Manuela", 4,"444666");
		curso.agregar("Veronica", 2);
		
		curso.borrar("Pedro");
		curso.mostrarNotas();
		
		//System.out.println("La norta de  Juan es: " + curso.buscar("Juan").getNota());
		Nota notaJuan=curso.buscar("Juan");
		System.out.println("La norta de  Juan es: " + curso.buscar("Juan").getNota() + " y su teléfono es: " + notaJuan.getTelefono());
		System.out.println("Promedio de notas " + curso.obtenerPromedio());
		System.out.println("Borrar las notas 10");
		System.out.println("Notas 10 borradas: " + curso.borrarPorNota(10));
		curso.mostrarNotas();
		
		
		
			
	}

}
