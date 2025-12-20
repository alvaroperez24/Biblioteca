package pckBiblioteca;

import java.util.Objects;

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



	@Override
	public String toString() {
		return "Libro [nomLibro=" + nomLibro + ", codLibro=" + codLibro + ", autor=" + autor + ", tematica=" + tematica
				+ "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(autor, codLibro, nomLibro, tematica);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(codLibro, other.codLibro)
				&& Objects.equals(nomLibro, other.nomLibro) && Objects.equals(tematica, other.tematica);
	}
	
	
	
}
