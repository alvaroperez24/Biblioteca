package pckBiblioteca;

public class Libro {
	
	private String nomLibro = "";
	private String codLibro = "";
	private String autor = "";
	private String tematica = "";
	
	public Libro(String nomLibro, String codLibro) {
		super();
		this.nomLibro = nomLibro;
		this.codLibro = codLibro;
	}


	public Libro(String nomLibro, String codLibro, String autor, String tematica) {
		super();
		this.nomLibro = nomLibro;
		this.codLibro = codLibro;
		this.autor = autor;
		this.tematica = tematica;
	}



	public String getNomLibro() {
		return nomLibro;
	}


	
	public void setNomLibro(String nomLibro) {
		this.nomLibro = nomLibro;
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

}
