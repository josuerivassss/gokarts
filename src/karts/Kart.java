package karts;

abstract class Kart{
  private int numero;
	private Tipo tipo;
	private Estado estado;

	public Kart(int numero, Tipo tipo, Estado estado){
		this.numero = numero;
		this.tipo = Tipo.Disponible;
		this.estado = estado;
	}
  
	public int getNumero(){
		return numero;	
	}
  public Tipo getTipo(){
		return tipo;	
	}
  public Estado getEstado(){
		return estado;	
	}

  abstract double getPrecio();
}
