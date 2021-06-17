package Ejemplo.Array2;

public class Test {

	public static void main(String[] args) {
		
		Agenda agenda= new Agenda();
		
		agenda.agregarContacto("Juan Perez", "111-111");
		agenda.agregarContacto("Jose Gomez", "222-222");
		agenda.agregarContacto(0, "Manu Gino", "333-333");
		
		//agenda.borrar(1);
		agenda.borrar("Manu GinoA");
		
		
		System.out.println("Cantidad de contactos: " + agenda.cantidadContactos());
		
		//Busca y muestra al contacto
		System.out.println("\nBuscando a:");
		System.out.println(agenda.buscar("Juan Perez"));
		
		agenda.reemplazar(0, new Persona("Loco Gatti", "444-444"));
		
		agenda.reemplazarTelefono("Jose GomezTEST", "555-555");
		agenda.reemplazarTelefono("Jose Gomez", "555-555");
		
		agenda.agregarContacto("Jose Gomez", "666-666");
		
		//agenda.mostrarForTradicional();
		agenda.mostrar();
		agenda.llamar("Loco Gatti", new Fecha(1, 1, 11));
		agenda.llamar("Loco Gatti", new Fecha(2, 2, 22));
		
		agenda.mostrarLlamadas("Loco Gatti");
		
		
		
		}	
}

