package Logico;

public class Trapecio extends FiguraPlana {
	
	private double longitudAlto;
	
	private double base_menor, base_mayor = 0, altura = 0;
	private double x1 = 0, x2 = 0, x3 = 0, x4 = 0;
	private double y1 = 0, y2 = 0, y3 = 0, y4 = 0;

	public Trapecio(double  alturaPrisma, String tipoPrisma, double longitudAlto, double base_menor, double base_mayor, double altura) {
		super(alturaPrisma,tipoPrisma);
		this.longitudAlto = longitudAlto; 
		this.base_menor = base_menor;
		this.base_mayor = base_mayor;
		
		// TODO Auto-generated constructor stub
	}

	
	public double getLongitudAlto() {
		return longitudAlto;
	}

	public void setLongitudAlto(float longitudAlto) {
		this.longitudAlto = longitudAlto;
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
		
		altura = y2 - y1;
		base_menor = x4 - x1;
		base_mayor = x3 - x2;
		
		return (  ((base_mayor + base_menor) * altura ) / 2);
	}


	@Override
	public double Perimetro() {
		
		base_menor = x4 - x1;
		base_mayor = x3 - x2;
		
		double lado1,lado2;
		
		lado1 = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		lado2 = Math.sqrt( Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) );
		
		return (lado1 + lado2 + base_menor + base_mayor);
	}

}