package Logico;

import java.util.ArrayList;

import java.io.Serializable;

public class Centro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList <Usuario> User;
	private static int cantestudiantes;
	private static Centro centro;
	private static Usuario loginUsuario;
	private static boolean firstTime;
	
	
	
	private Centro() {
		User = new ArrayList<>();
		cantestudiantes = 0;
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
	
	public static int getCantestudiantes() {
		return cantestudiantes;
	}

	public static void setCantestudiantes(int cantestudiantes) {
		Centro.cantestudiantes = cantestudiantes;
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
	
	
	
	//public void RegistrarUsuario(Usuario user) {
	//	User.add(user);
	//}

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
	
	public void InsertarUsuario(Usuario aux){
		User.add(aux);
	} 
	
	
	public String BuscarEstudianteporID(String idestudiante) {
		String aux = null;
		boolean encontrado = false;
		int i = 0;
		while(! encontrado && i< User.size()){
			if(User.get(i).getId().equalsIgnoreCase(idestudiante)){
				aux = User.get(i).getId();
				encontrado = true;
			}
			i++;
		}
		return aux;
	}
	private int indexBycodigo(String codigo) {
		boolean encontrado = false;
		int i = 0;
		int index = -1;
		while (!encontrado && i< cantestudiantes) {
			if(User.get(i).getId().equalsIgnoreCase(codigo)){
				encontrado = true;
				index = i;
				 
			}
			i++;
		}
		return index;
	}
	public void modificarUsuario(Usuario miusu) {
		int index = indexBycodigo(miusu.getId());
		this.User = new ArrayList <Usuario>(index);
	}
	public void EliminarUsuario(String identificador) {
		int index = -1;
		int i= 0;
		if(indexBycodigo(identificador)>-1){
			index = indexBycodigo(identificador);
			i = index;
				while(i<cantestudiantes-1){
				 this.User = new ArrayList <Usuario>(i+1);
				  i++;
				}
			cantestudiantes--;	
		}

	}
public void RegistrarEst() {
		
	}
	public void RemoverEst() {
		
	}

	

}