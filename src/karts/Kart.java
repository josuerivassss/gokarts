package karts;

abstract class Kart{
    private int numero;
    private Tipo tipo;
	private Estado estado;

	public Kart(int numero, Tipo tipo){
		this.numero = numero;
		this.tipo = tipo;
		this.estado = Estado.Disponible;
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

    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    abstract double getPrecio();
}
