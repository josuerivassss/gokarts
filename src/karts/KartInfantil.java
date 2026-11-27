package karts;

public class KartInfantil extends Kart{
	private double precio;
	private static final double PRECIO_INFANTIL = 200;
	
	public KartInfantil(int numero, Tipo tipo, Estado estado, doble precio){
		super(numero, tipo, estado);
		this.precio = PRECIO_INFANTIL;
	}	
  
	public double getPrecio(){
		return precio;
	}
}
