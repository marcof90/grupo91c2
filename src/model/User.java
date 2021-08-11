package model;

public class User {

    private String nombre;

    public User(String pNombre) {
        super();
        nombre = pNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
