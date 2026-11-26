package karts;

public class KartInfantil extens Kart{
	private double precio;
	private static final PRECIOINFANTIL=200;
	
	public KartInfantil(int numero, Tipo tipo, Estado estado, doble precio){
		super(numero, tipo, estado);
		this.precio = PRECIOINFANTIL;
	}	
  
	public double getPrecio(){
		return precio;
	}
}
