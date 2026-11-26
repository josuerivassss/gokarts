package usuarios;

public class Socio implements Cliente {
    static final double DESCUENTO = 0.1;
    static final int HORAS_MAXIMAS = 2;

    public double getDescuento() {
        return DESCUENTO;
    }

    public int getHorasMaximas() {
        return HORAS_MAXIMAS;
    }
}
