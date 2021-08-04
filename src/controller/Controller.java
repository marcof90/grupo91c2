package controller;

import java.util.Date;
import java.util.ArrayList;

import model.Client;

public class Controller {
    
    private ArrayList<Client> clientes;

    public Controller() {
        super();
        clientes = new ArrayList<>();
    }

    public void addCliente(Date fechaNacimiento, String nombre) {
        Client cliente = new Client(nombre, fechaNacimiento);
        clientes.add(cliente);
    }

    public String getListDataClientes() {
        String lista = "";
        for (Client client : clientes) {
            lista += client + "\n";
        }
        return lista;
    }    
}
