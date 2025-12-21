package pckBiblioteca;

public class Libro {
	
	private String titulo = "";
	private String codLibro = "";
	private String autor = "";
	private String tematica = "";
	private float precio;
	
	public Libro(String titulo, String codLibro, float precio) {
		super();
		this.titulo = titulo;
		this.codLibro = codLibro;
		this.precio = precio;
	}


	public Libro(String titulo, String codLibro, String autor, String tematica, float precio) {
		super();
		this.titulo = titulo;
		this.codLibro = codLibro;
		this.autor = autor;
		this.tematica = tematica;
		this.precio = precio;
	}



	public String getNomLibro() {
		return titulo;
	}


	
	public void setNomLibro(String nomLibro) {
		this.titulo = nomLibro;
	}



	public String getCodLibro() {
		return codLibro;
	}


	/*
	public void setCodLibro(String codLibro) {
		this.codLibro = codLibro;
	}
	*/


	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getTematica() {
		return tematica;
	}



	public void setTematica(String tematica) {
		this.tematica = tematica;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
