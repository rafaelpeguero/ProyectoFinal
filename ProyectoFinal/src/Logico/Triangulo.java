package Logico;

public class Triangulo extends FiguraPlana {

	
//TRIANGULO POSEE 3 VERTICES 
	public Triangulo(Vertice verticeA, Vertice verticeB, Vertice verticeC,float alturaPrisma,String tipoPrisma) {
		super(verticeA, verticeB, verticeC,alturaPrisma,tipoPrisma);
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