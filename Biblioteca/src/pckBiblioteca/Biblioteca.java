package pckBiblioteca;

import java.util.*;

public class Biblioteca {
	
	ArrayList<Libro> catalogo = new ArrayList<>();

	public ArrayList<Libro> getCatalogo() {
		return catalogo;
	}
	/*
	public void setCatalogo(ArrayList<Libro> catalogo) {
		this.catalogo = catalogo;
	}
	*/
	
	public void anadirLibro(Libro libro) {
		catalogo.add(libro);
	}
	
}
