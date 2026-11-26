package karts;

public class KartAdulto extens Kart{
	private doublé precio;
	private static final PRECIOADULTO=300;
	public KartAdulto(int numero, Tipo tipo, Estado estado, doble precio){
		super(numero, tipo, estado);
		this.precio = PRECIOADULTO;
	}	
  
	public double getPrecio(){
		return precio;
	}
}
