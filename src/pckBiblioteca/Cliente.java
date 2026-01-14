package pckBiblioteca;

import java.util.*;

public class Cliente extends Usuario {
		
	ArrayList <Libro> cesta = new ArrayList<>();
	
	public Cliente(String nom, String apell1, String apell2, String correo, String contraseña, String direccion) {
		super(nom, apell1, apell2, correo, contraseña, direccion);

	}

	public Cliente(String nom) {
		super(nom);

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
