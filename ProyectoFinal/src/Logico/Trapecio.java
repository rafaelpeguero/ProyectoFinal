package Logico;

public class Trapecio extends FiguraPlana {
	
	//Atributos para un Trapecio
	private double longitudAlto;
	private double base_menor, base_mayor = 0, altura = 0;
	
	private double x1 = 0, x2 = 0, x3 = 0, x4 = 0;
	private double y1 = 0, y2 = 0, y3 = 0, y4 = 0;

	public Trapecio(double  alturaPrisma, String tipoPrisma, double x1, double x2, double x3,double x4,double y1,double y2, double y3, double y4, double longitudAlto) {
		super(alturaPrisma,tipoPrisma);
		
		this.x1 = x1; 
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		
		this.longitudAlto = longitudAlto;

	}
	
	public double getLongitudAlto() {
		return longitudAlto;
	}

	public void setLongitudAlto(float longitudAlto) {
		this.longitudAlto = longitudAlto;
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
		altura = y2 - y1;
		base_menor = x4 - x1;
		base_mayor = x3 - x2;
		
		return (  ((base_mayor + base_menor) * altura ) / 2);
	}

	@Override
	public double Perimetro() {
		double lado1,lado2;
		
		base_menor = x4 - x1;
		base_mayor = x3 - x2;
		
		lado1 = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		lado2 = Math.sqrt( Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) );
		
		return (lado1 + lado2 + base_menor + base_mayor);
	}

}