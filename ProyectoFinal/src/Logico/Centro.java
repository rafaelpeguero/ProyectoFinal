package Logico;

import java.util.ArrayList;

import java.io.Serializable;

public class Centro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList <Usuario> User;
	private static Centro centro;
	private static Usuario loginUsuario;
	private static boolean firstTime;
	
	private Centro() {
		User = new ArrayList<>();
	}
	
	public static Centro getInstance(){
		if(centro == null){
			centro = new Centro();
		}
		return centro;
	}
	
	
	public ArrayList<Usuario> getUser() {
		return User;
	}
	
	public void setUser(ArrayList<Usuario> user) {
		User = user;
	}
	
	public static Centro getCentro() {
		return centro;
	}
	
	public static void setCentro(Centro centro) {
		Centro.centro = centro;
	}
	
	public static Usuario getLoginUsuario() {
		return loginUsuario;
	}
	
	public static void setLoginUsuario(Usuario loginUsuario) {
		Centro.loginUsuario = loginUsuario;
	}
	
	
	
	public void RegistrarUsuario(Usuario user) {
		User.add(user);
	}

	public static boolean isFirstTime() {
		return firstTime;
	}

	public static void setFirstTime(boolean firstTime) {
		Centro.firstTime = firstTime;
	}
	
	public boolean ConfirmarLogin(String text1, String text2) {
		boolean log = false;
		for (Usuario user : User) {
			if(user.getNombreUsuario().equals(text1)){
				loginUsuario = user;
				log = true;
			}
		}
		return log;
	}
	
	
	
public void RegistrarEst() {
		
	}
	public void RemoverEst() {
		
	}

}