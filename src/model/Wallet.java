package model;

public class Wallet {
    
    private int saldo;

    public Wallet() {
        super();
        saldo = 0;
    }

    public String guardarDinero(int valor){
        if(valor < 0){
            return "Cantidad no válida";
        }
        saldo += valor;
        return "Exito! Ahora tienes $" + saldo;
    }

    public String retirarDinero(int valor){
        if(valor < 0){
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
