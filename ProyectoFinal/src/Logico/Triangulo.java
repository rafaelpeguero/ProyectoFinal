package Logico;

//TRIANGULO POSEE 3 VERTICES 
public class Triangulo extends FiguraPlana {

	//Atributos para un Triangulo
	private double x1, x2, x3;
	private double y1, y2, y3;
	
	private double lado1,lado2,lado3,lado4;


	public Triangulo(double alturaPrisma,String tipoPrisma,double x1, double x2, double x3, double y1, double y2, double y3) {
		super(alturaPrisma,tipoPrisma);
		this.x1 = x1;
		this.x2 = x3;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;		
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getY3() {
		return y3;
	}

	public void setY3(double y3) {
		this.y3 = y3;
	}

	
	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double AreaLateral() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double AreasTotales() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean Validador() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double Areabase() {
		double altura=0;
		
		//x2-x1 = base, y2-y1 = altura
		//El area de un triguanlo es igual a la base de este por la altura divido en 2
		
		
		//lado1 = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		lado2 = Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) );
		lado3 = Math.sqrt( Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2) );
		
		altura = Math.sqrt( Math.pow(lado2 , 2) - Math.pow( lado3 / 2 , 2) );
		
		return ( lado3*altura / 2);
	}



	@Override
	public double Perimetro() {
		
		lado1 = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		lado2 = Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) );
		lado3 = Math.sqrt( Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2) );
		
		return ( lado1 + lado2 + lado3 );
	}

}