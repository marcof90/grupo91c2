package model;

public class Admin extends User {
    private int codigo;

    public Admin(int codigo, String nombre) {
        super(nombre);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
