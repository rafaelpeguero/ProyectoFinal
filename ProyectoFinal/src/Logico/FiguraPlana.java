package Logico;



public abstract class FiguraPlana {
	
	protected double alturaPrisma;
	protected String tipoPrisma;
	
	

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