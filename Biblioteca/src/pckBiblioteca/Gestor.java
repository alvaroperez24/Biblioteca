package pckBiblioteca;

public class Gestor extends Persona {
	
	private Libro libro;
	private float descuento = 0.25f;
	private String nrp = "";
	
	
	public Gestor(String nom, String apell1, String apell2, String correo, String contraseña, String direccion) {
		super(nom, apell1, apell2, correo, contraseña, direccion);

	}

	public Gestor(String nom) {
		super(nom);

	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public String getNrp() {
		return nrp;
	}
	/*
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	*/
	
	public void anyadirLibro() {
		
	}
	
	public void eliminarLibro() {
		
	}
	
	
	public void buscarLibro() {
		
	}
	
	public void anayadirLibroCesta() {
		
	}
	
	public void eliminarLibroCesta() {
		
	}
	
	public void comprar() {
		
	}
	
}
