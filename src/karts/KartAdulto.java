package karts;

public class KartAdulto extends Kart{
	private double precio;
	private static final double PRECIO_ADULTO = 300;
	public KartAdulto(int numero, Tipo tipo, Estado estado, doble precio){
		super(numero, tipo, estado);
		this.precio = PRECIO_ADULTO;
	}	
  
	public double getPrecio(){
		return precio;
	}
}
