package usuarios;

public class Visitante implements Cliente {
    static final double DESCUENTO = 0;
    static final int HORAS_MAXIMAS = 1;

    public double getDescuento() {
        return DESCUENTO;
    }

    public int getHorasMaximas() {
        return HORAS_MAXIMAS;
    }
}
