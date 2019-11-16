package Logico;



public abstract class FiguraPlana {
	
	protected Vertice verticeA,verticeB,verticeC,verticeD;
	protected double alturaPrisma;
	protected String tipoPrisma;
	
	
//CONSTRUCTORES PARA LAS DIFERENS FIGURAS SEGUN SU CANTIDAD DE VERTICES
	public FiguraPlana(Vertice verticeA, Vertice verticeB, Vertice verticeC, Vertice verticeD,float alturaPrisma,String tipoPrisma) {
		super();
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
		this.verticeD = verticeD;
		this.alturaPrisma = alturaPrisma;
		this.tipoPrisma = tipoPrisma;
		
	}
	public FiguraPlana(Vertice verticeA, Vertice verticeB, Vertice verticeC,float alturaPrisma, String tipoPrisma) {
		super();
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
		this.alturaPrisma = alturaPrisma;
		this.tipoPrisma = tipoPrisma;
	}
	public FiguraPlana(Vertice verticeA, Vertice verticeB,float alturaPrisma, String tipoPrisma) {
		super();
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.alturaPrisma = alturaPrisma;
		this.tipoPrisma = tipoPrisma;
	}
	public FiguraPlana(double alturaPrisma, String tipoPrisma) {
		super();
		this.alturaPrisma = alturaPrisma;
		this.tipoPrisma = tipoPrisma;
	}
	
	
	public abstract float Volumen();
	public abstract float AreaLateral();
	public abstract float AreasTotales();
	public abstract boolean Validador();
	public abstract double Areabase();
	public abstract double Perimetro();

}