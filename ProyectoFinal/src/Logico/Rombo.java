package Logico;

//ROMBO POSEE CUATRO VERTICES
public class Rombo extends FiguraPlana {
	
	//Atributos para un Rombo
	private double x, y, dV, dH; 
	//dV = Diamertro Vertical y dH = Diamtero Horizontal
	
	
	public Rombo(double alturaPrisma,String tipoPrisma,double x,double dH, double y,double dV) {
		super(alturaPrisma,tipoPrisma);
	
		this.x = x; 
		this.y = y;
		this.dV = dV;
		this.dH= dH;
		
	}
	
	public void completador() {
		dV = 0;
		dH = 0;
	}

	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getdV() {
		return dV;
	}

	public void setdV(double dV) {
		this.dV = dV;
	}

	public double getdH() {
		return dH;
	}

	public void setdH(double dH) {
		this.dH = dH;
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
		return ( (dV*dH)/2 );
	}


	@Override
	public double Perimetro() {
		return (4 * Math.sqrt(  Math.pow(dV/2, 2) + Math.pow(dH/2, 2) )  );
		
	}

}