package karts;

public class KartDoble extends Kart{
	private double precio;
	private static final double PRECIODOBLE=400;
	public artDoble(int numero, Tipo tipo, Estado estado, doble precio){
		super(numero, tipo, estado);
		this.precio = PRECIODOBLE;
	}	
  
	public double getPrecio(){
		return precio;
	}
}
