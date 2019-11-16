package Logico;

public class Rombo extends FiguraPlana {

	//ROMBO POSEE CUATRO VERTICES
	public Rombo(Vertice verticeA, Vertice verticeB, Vertice verticeC, Vertice verticeD,float alturaPrisma,String tipoPrisma) {
		super(verticeA, verticeB, verticeC, verticeD,alturaPrisma,tipoPrisma);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}