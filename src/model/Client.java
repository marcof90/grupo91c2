package model;

import java.util.Date;

public class Client extends User{
    
    private Wallet wallet;

    private Date fechaNacimiento;

    public Client(String nombre, Date fechaNacimiento) {
        super(nombre);
        this.fechaNacimiento = fechaNacimiento;
        wallet = new Wallet();
    }

    public Wallet getWallet() {
        return wallet;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre:"+ getNombre() + " Fecha:" + fechaNacimiento.toString();
        // return super.toString();
    }

}
