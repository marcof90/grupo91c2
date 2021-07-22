package model;

public class User {

    private String nombre;

    private Wallet billetera;

    public User(String pNombre) {
        super();
        nombre = pNombre;
        billetera = new Wallet();
    }

    public String getNombre() {
        return nombre;
    }

    public Wallet getBilletera() {
        return billetera;
    }

}
