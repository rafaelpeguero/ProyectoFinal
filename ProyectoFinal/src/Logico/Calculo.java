package Logico;

public class Calculo {

	public Calculo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangulo r = new Rectangulo(0, null, 0, 0, 0, 0, 0, 0);
		  //double n;		  
				  
		  r.setX1(6.0d); r.setX2(3.0d); r.setX3(-3.0d);
		  r.setY1(4.0d); r.setY2(-1.0d); r.setY3(-2.0d);
		  
		  
		  //n = r.Areabase();
		  
		  System.out.println("Area: " + r.Areabase());

	}

}
