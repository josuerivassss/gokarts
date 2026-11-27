package karts;

public class KartDoble extends Kart{
	private double precio;
	private static final double PRECIO_DOBLE = 400;
	public artDoble(int numero, Tipo tipo, Estado estado, doble precio){
		super(numero, tipo, estado);
		this.precio = PRECIO_DOBLE;
	}	
  
	public double getPrecio(){
		return precio;
	}
}
