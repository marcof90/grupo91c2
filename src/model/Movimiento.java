package model;

import java.util.Date;

public class Movimiento {

    /**
     * I si es un ingreso <p>
     * R si es un retiro <p>
     * P si es un pago
     */
    private char tipo;

    private int monto;

    private Date fecha;

    public Movimiento(char tipo, int monto) {
        super();
        this.monto = monto;
        this.tipo = tipo;
        fecha = new Date();
    }

    public int getMonto() {
        return monto;
    }

    public char getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Detalles: Monto:$"+monto+ " Tipo:"+tipo+" Fecha:"+fecha;
    }
}

