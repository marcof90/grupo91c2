package controller;

import java.util.Date;
import java.util.Locale;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Client;
import services.JavaMySQLService;

public class Controller {
    
    private ArrayList<Client> clientes;
    private JavaMySQLService serviceDB;

    public Controller() {
        super();
        clientes = new ArrayList<>();
        serviceDB = new JavaMySQLService();
        checkConnect();
    }

    public void checkConnect() {
        try {
            if (serviceDB.getConnect().isValid(360)) {
                fillUsersData(serviceDB.getUsersDB());
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void fillUsersData(ResultSet rs) {
        try {
            while (rs.next()) {
                Date fechaNacimiento = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(rs.getString("fecha_nacimiento"));
                Client cliente = new Client(rs.getString("nombre"), fechaNacimiento);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void addCliente(Date fechaNacimiento, String nombre) {
        Client cliente = new Client(nombre, fechaNacimiento);
        clientes.add(cliente);
        serviceDB.insertUser(fechaNacimiento, nombre);
    }

    public String getListDataClientes() {
        String lista = "";
        for (Client client : clientes) {
            lista += client + "\n";
        }
        return lista;
    }    

    public String[] getListClients() {
        String[] datos = new String[clientes.size()];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = clientes.get(i).toString();
        }
        return datos;
    }
}
