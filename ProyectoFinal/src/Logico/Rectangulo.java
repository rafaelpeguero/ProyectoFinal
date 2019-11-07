package Logico;

public class Rectangulo extends FiguraPlana {
	
	
	public Rectangulo(Vertice verticeA, Vertice verticeB, Vertice verticeC,float alturaPrisma,String tipoPrisma ) {
		super(verticeA,verticeB, verticeC,alturaPrisma,tipoPrisma);
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