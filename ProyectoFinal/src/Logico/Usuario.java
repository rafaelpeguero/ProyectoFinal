package Logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String id;
	private String tipo;
	private String NombreUsuario;
	private String Contrasena;
	private String Confirmar;
	private ArrayList<FiguraPlana> MisPrismas;
	
	public Usuario(String tipo, String nombreUsuario, String contrasena, String confirmar, ArrayList<FiguraPlana> misPrismas) {
		super(); 
		this.tipo = tipo;
		this.NombreUsuario = nombreUsuario;
		this.Contrasena = contrasena;
		this.Confirmar = confirmar;
		this.MisPrismas = misPrismas;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	public String getConfirmar() {
		return Confirmar;
	}
	public void setConfirmar(String confirmar) {
		Confirmar = confirmar;
	}
	

	
	
	
	public ArrayList<FiguraPlana> getMisPrismas() {
		return MisPrismas;
	}
	
	public void setMisPrismas(ArrayList<FiguraPlana> misPrismas) {
		MisPrismas = misPrismas;
	}
	

	

	
}
