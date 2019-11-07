package Logico;

public class Trapecio extends FiguraPlana {
	
	private float longitudAlto;

	public Trapecio(Vertice verticeA, Vertice verticeB, Vertice verticeC, Vertice verticeD, float alturaPrisma,String tipoPrisma, float longitudAlto) {
		super(verticeA, verticeB, verticeC, verticeD,alturaPrisma,tipoPrisma);
		this.longitudAlto = longitudAlto; 
		// TODO Auto-generated constructor stub
	}

	
	public float getLongitudAlto() {
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

}