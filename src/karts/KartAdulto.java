package karts;

public class KartAdulto extends Kart{
	private double precio;
	private static final double PRECIOADULTO = 300;
	public KartAdulto(int numero, Tipo tipo, Estado estado, doble precio){
		super(numero, tipo, estado);
		this.precio = PRECIOADULTO;
	}	
  
	public double getPrecio(){
		return precio;
	}
}
