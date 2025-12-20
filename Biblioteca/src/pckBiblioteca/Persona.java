package pckBiblioteca;

public class Persona {
	
	private String nom = "";
	private String apell1 = "";
	private String apell2 = "";
	private String correo = "";
	private String contraseña = "";
	private String direccion = "";
	
	
	public Persona(String nom) {
		super();
		this.nom = nom;
	}


	public Persona(String nom, String apell1, String apell2, String correo, String contraseña, String direccion) {
		super();
		this.nom = nom;
		this.apell1 = apell1;
		this.apell2 = apell2;
		this.correo = correo;
		this.contraseña = contraseña;
		this.direccion = direccion;
	}


	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getApell1() {
		return apell1;
	}


	public void setApell1(String apell1) {
		this.apell1 = apell1;
	}


	public String getApell2() {
		return apell2;
	}


	public void setApell2(String apell2) {
		this.apell2 = apell2;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		
}
