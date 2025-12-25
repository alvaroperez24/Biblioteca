package pckBiblioteca;

public class Libro {
	
	private String titulo = "";
	private String isbn = "";
	private String autor = "";
	private String tematica = "";
	private float precio;
	
	public Libro(String titulo, String codLibro) {
		super();
		this.titulo = titulo;
		this.isbn = codLibro;
	}


	public Libro(String titulo, String codLibro, String autor, String tematica, float precio) {
		super();
		this.titulo = titulo;
		this.isbn = codLibro;
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



	public String getIsbn() {
		return isbn;
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
