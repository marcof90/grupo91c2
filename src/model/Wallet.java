package model;

public class Wallet {
    
    /**
     * Cantidad de dinero actual en la billetera
     */
    private int saldo;


    public Wallet() {
        super();
        saldo = 0;
    }

    /**
     * Devuelve el saldo actual de la billetera
     * @return saldo actual de la billetera
     */
    public int getSaldo() {
        return saldo;
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
    public String guardarDinero(int valor){
        if(valor <= 0){
            return "Cantidad no válida";
        }
        saldo += valor;//saldo = saldo + valor;
        return "Exito! Ahora tienes $" + saldo;
    }

    public String retirarDinero(int valor){
        if(valor <= 0){
            return "Cantidad no válida";
        }
        if(valor > saldo){
            return "Saldo insuficiente";
        }
        saldo -= valor;
        return "Exito! Ahora tienes $" + saldo;
    }

    public String consultarSaldo(){
        return "Tu saldo es: $" + saldo;
    }
}
