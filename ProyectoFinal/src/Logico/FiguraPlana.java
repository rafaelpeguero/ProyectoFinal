package Logico;


public abstract class FiguraPlana {
	
	protected double alturaPrisma;
	protected String tipoPrisma;
	
	

	public FiguraPlana(double alturaPrisma, String tipoPrisma) {
		super();
		this.alturaPrisma = alturaPrisma;
		this.tipoPrisma = tipoPrisma;
	}
	
	public abstract double Volumen();
	public abstract double AreaLateral();
	public abstract double AreasTotales();
	public abstract boolean Validador();
	public abstract double Areabase();
	public abstract double Perimetro();

}