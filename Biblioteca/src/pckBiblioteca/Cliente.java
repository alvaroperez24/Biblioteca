package pckBiblioteca;

import java.util.*;

public class Cliente extends Persona {
		
	ArrayList <Libro> cesta = new ArrayList<>();
	
	public Cliente(String nom, String apell1, String apell2, String correo, String contraseña, String direccion) {
		super(nom, apell1, apell2, correo, contraseña, direccion);

	}

	public Cliente(String nom) {
		super(nom);

	}	

	public void buscarLibro(Biblioteca biblioteca, String buscador){
		for (int i = 0; i < biblioteca.getCatalogo().size(); i++) {
			
		}
	}
	
	public void anayadirLibroCesta(Biblioteca biblioteca, String nomLibro) {
		for (int i = 0; i < biblioteca.getCatalogo().size(); i++) {
			if (nomLibro == biblioteca.getCatalogo().get(i).getNomLibro()) {
				System.out.println("El libro " + nomLibro + " ha sido añadido a tu cesta.");
				cesta.add(biblioteca.getCatalogo().get(i));
			} else {
				System.out.println("Ese libro no existe o no lo tenemos en la biblioteca. Tienes la herramienta buscar para encontrar los libros que tenemos.");
			}
		}
	}
	
	public void eliminarLibroCesta(Biblioteca biblioteca, String nomLibro) {
		for (int i = 0; i < biblioteca.getCatalogo().size(); i++) {
			if (nomLibro == biblioteca.getCatalogo().get(i).getNomLibro()) {
				System.out.println("El libro " + nomLibro + " ha sido añadido a tu cesta.");
				cesta.remove(biblioteca.getCatalogo().get(i));
			} else {
				System.out.println("El libro seleccionado no esta en tu cesta.");
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
	}
	
}
