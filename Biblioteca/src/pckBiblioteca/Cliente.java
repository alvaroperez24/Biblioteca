package pckBiblioteca;

public class Cliente extends Persona {
	
	private Libro libro;
	
	public Cliente(String nom, String apell1, String apell2, String correo, String contraseña, String direccion) {
		super(nom, apell1, apell2, correo, contraseña, direccion);

	}

	public Cliente(String nom) {
		super(nom);

	}	

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	

	public void buscarLibro(){
		
	}
	
	public void anayadirLibroCesta() {
		
	}
	
	public void eliminarLibroCesta() {
		
	}
	
	public void comprar() {
		
	}
	
}
