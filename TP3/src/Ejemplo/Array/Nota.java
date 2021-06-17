package Ejemplo.Array;

public class Nota {

	private String nombre;
	private int nota;
	private String telefono;
	
	public Nota(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;		
	}
	
	public Nota(String nombre, int nota, String telefono) {
		this.nombre = nombre;
		this.nota = nota;
		this.telefono=telefono;
	}
	

	@Override
	public String toString() {
		return "Nota [nombre=" + nombre + ", nota=" + nota + ", telefono=" + telefono + "]";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}

