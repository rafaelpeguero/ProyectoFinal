package Logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String tipo;
	private String NombreUsuario;
	private String Contrasena;
	private ArrayList<FiguraPlana> MisPrismas;
	
	public Usuario(String tipo, String nombreUsuario, String contrasena, ArrayList<FiguraPlana> misPrismas) {
		super();
		this.tipo = tipo;
		this.NombreUsuario = nombreUsuario;
		this.Contrasena = contrasena;
		this.MisPrismas = misPrismas;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNombreUsuario() {
		return NombreUsuario;
	}
	
	public void setNombreUsuario(String NombreUsuario) {
		this.NombreUsuario = NombreUsuario;
	}
	
	public String getContrasena() {
		return Contrasena;
	}
	
	public void setContrasena(String Contrasena) {
		this.Contrasena = Contrasena;
	}
	
	

	
	
	
	public ArrayList<FiguraPlana> getMisPrismas() {
		return MisPrismas;
	}
	
	public void setMisPrismas(ArrayList<FiguraPlana> misPrismas) {
		MisPrismas = misPrismas;
	}
	

	
}
