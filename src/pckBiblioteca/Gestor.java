package pckBiblioteca;

import java.util.*;

public class Gestor extends Usuario {
	
	private float descuento = 0.25f;
	private String nrp = "";
	
	ArrayList <Libro> cesta = new ArrayList<>();
	
	
	public Gestor(String nom, String apell1, String apell2, String correo, String contraseña, String direccion) {
		super(nom, apell1, apell2, correo, contraseña, direccion);

	}

	public Gestor(String nom) {
		super(nom);

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
	
	public void anyadirLibro(Biblioteca biblioteca, Libro libro) {
		System.out.println("El libro " + libro.toString() + " ha sido añadido al catálogo.");
		biblioteca.getCatalogo().add(libro);
	}
	
	public void eliminarLibro(Biblioteca biblioteca, String isbn) {
		for (int i = 0; i < biblioteca.getCatalogo().size(); i++) {
			if (isbn == biblioteca.getCatalogo().get(i).getIsbn()) {
				System.out.println("El libro " + biblioteca.getCatalogo().get(i) + " ha sido eliminado de la biblioteca.");
				biblioteca.getCatalogo().remove(i);
			} else {
				System.out.println("Ese libro no existe en nuestra biblioteca por lo que no se ha eliminado nada.");
			}
		}
	}
	
	public void comprar() {
		float precioFinal = 0;
		System.out.println("Esta es tu cesta actual.");
		for (int i = 0; i < cesta.size(); i++) {
			System.out.println(cesta.get(i));
			precioFinal = precioFinal + cesta.get(i).getPrecio();
		}
		System.out.println("El precio total de tu cesta es de: " + precioFinal);
		
		precioFinal = precioFinal - (precioFinal*descuento);
		System.out.println("Con el descuento de trabajador se te queda en: " + precioFinal);
	}
	
}
