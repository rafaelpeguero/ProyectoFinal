package Logico;

public class Cuadrado extends FiguraPlana {

	private double base = 0, altura = 0;
	private double x1 = 0, x2 = 0, x3 = 0, x4 = 0;
	private double y1 = 0, y2 = 0, y3 = 0, y4 = 0;	
	
	
	
	public Cuadrado(double alturaPrisma,String tipoPrisma, double x1, double x2, double y1, double y2) {
		super(alturaPrisma,tipoPrisma);
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;	
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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

	public double getX4() {
		return x4;
	}

	public void setX4(double x4) {
		this.x4 = x4;
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

	public double getY4() {
		return y4;
	}

	public void setY4(double y4) {
		this.y4 = y4;
	}

	@Override
	public float Volumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float AreaLateral() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float AreasTotales() {
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
		base  = Math.abs(x2 -x1);
		
		if(base == 0)
			base = Math.abs(y2 - y1);
		
		return (base * 4); 
		
	}

	@Override
	public double Perimetro() {
	     base = Math.abs(x2 - x1);
		
		if(base == 0)
			base = Math.abs(y2 - y1);
		
		return (Math.pow(base, 2));
		
	}

}