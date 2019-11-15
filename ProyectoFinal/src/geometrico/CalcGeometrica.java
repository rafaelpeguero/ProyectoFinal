package geometrico;

public class CalcGeometrica {
	
	private double x1,x2,x3,x4,y1,y2,y3,y4;

	public CalcGeometrica() {
		// TODO Auto-generated constructor stub
	}
	
	public double rectArea(double x1,double x2, double x3, double y1, double y2, double y3){//Vx3
	 
	}
	public double cuadArea(double x1,double x2, double y1, double y2){//Vx2
		double x3,x4,y3,y4,aux1,aux2;
		
		aux1= x2-x1, aux2 = y2-y1; //Vector que union entre los Vertices
		
		x3 = x1 + aux1, y3 = y1 + aux2; // V3 Encontrado
		x4 = x2 + aux1, y4 = y2 + aux2; // V4 Encontrado
		
		//Para calcular el área del cuadrilátero vamos a utilizar la fórmula de Herón:


	
	}
	public double triaArea(double x1,double x2,double x3,double x4, double y1, double y2,double y3,double y4){//Vx4
		//Área = 1/2 * | X1 * (Y2 - Y3) + X2 * (Y3 - Y1) + X3 * (Y1 - Y2) |”
		double area = 0;
		
		area = Math.abs( x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2) )/2 ;
		
		return area;
	
	}
	public double trapArea(double x1,double x2,double x3,double x4, double y1, double y2,double y3,double y4){//Vx4
	
	}
	public double trapArea(double x1,double x2,double x3,double x4, double y1, double y2,double y3,double y4){//Vx4
	
	}
	
	public double distanciaAB(double x1, double x2, double y1, double y2 ){
	
		double s;
		
		s = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) );
		
		return s;
		
	}
		
	
	

}
