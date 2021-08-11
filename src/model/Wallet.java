package model;

import java.util.ArrayList;

public class Wallet {
    
    public final static int LIMITE = 1200000;
    public final static int MINIMO_TRANSACCION = 10000;
    /**
     * Cantidad de dinero actual en la billetera
     */
    private int saldo;

    private boolean tieneLimite;

    /**
     * Lista de movimientos en la wallet
     */
    private ArrayList<Movimiento> movimientos;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        movimientos = new ArrayList<>();
    }

    /**
     * Devuelve el saldo actual de la billetera
     * @return saldo actual de la billetera
     */
    public int getSaldo() {
        return saldo;
    }

    public boolean isTieneLimite() {
        return tieneLimite;
    }

    public void setTieneLimite(boolean tieneLimite) {
        this.tieneLimite = tieneLimite;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Permite cambiar el saldo actual por un valor que llega por parametro 
     * @param saldo representa el nuevo saldo de la billetera
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo que permite guardar una cantidad de dinero dada por parametro en la billetera
     * @param valor cantidad de dinero que se guardara en la billetera
     * @return "cantidad no valida" en caso de que valor <= 0.
     *          "Exito! Ahora tienes $" + saldo, en caso de que se pueda guardar el dinero
     */
    public String guardarDinero(int valor) throws Exception  {
        if(valor <= 0){
            throw new Exception("Cantidad no válida");
            // return "Cantidad no válida";
        }
        if(saldo + valor > LIMITE && tieneLimite){
            return "No puedes superar el limite: $" + LIMITE;
        }
        if(valor < MINIMO_TRANSACCION && tieneLimite){
            return "El valor mínimo por transacción es: $"+MINIMO_TRANSACCION;
        }
        saldo += valor;//saldo = saldo + valor;
        Movimiento ingreso = new Movimiento('I', valor);
        movimientos.add(ingreso);
        return "Exito! Ahora tienes $" + saldo;
    }

    public String retirarDinero(int valor){
        if(valor <= 0){
            return "Cantidad no válida";
        }
        if(valor > saldo){
            return "Saldo insuficiente";
        }
        if(valor < MINIMO_TRANSACCION && tieneLimite){
            return "El valor mínimo por transacción es: $"+MINIMO_TRANSACCION;
        }
        saldo -= valor;
        Movimiento retiro = new Movimiento('R', valor);
        movimientos.add(retiro);
        return "Exito! Ahora tienes $" + saldo;
    }

    public String consultarSaldo(){
        return "Tu saldo es: $" + saldo;
    }

    public String romperLimite(){
        if(!tieneLimite){
            return "Tu cuenta no tenia limites";
        }
        if(saldo < 20000){
            return "Saldo insuficiente";
        }
        tieneLimite = false;
        saldo = saldo - 20000; // saldo -= 20000;
        Movimiento pago = new Movimiento('P', 20000);
        movimientos.add(pago);
        return "Tu cuenta ya no tiene limites!";
    }

}
