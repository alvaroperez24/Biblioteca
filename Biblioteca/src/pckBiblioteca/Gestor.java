package pckBiblioteca;

import java.util.ArrayList;

public class Gestor extends Persona {
	
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
	
	public void anyadirLibro(Biblioteca biblioteca ,Libro libro) {
		biblioteca.getCatalogo().add(libro);
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
