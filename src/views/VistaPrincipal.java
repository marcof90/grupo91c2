package views;

import javax.swing.JFrame;

import controller.Controller;

import java.awt.BorderLayout;
import java.util.Date;

public class VistaPrincipal extends JFrame{

    //crear la relacion o atributo
    private PanelOpciones panelOpciones;
    private PanelClientes panelClientes;

    private Controller control;

    public VistaPrincipal() {
        super();
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Billetera digital");
        setLayout(new BorderLayout());

        control = new Controller();
        //inicializar la relacion o atributo
        panelOpciones = new PanelOpciones(this);
        panelClientes = new PanelClientes(this);
        //modificar las propiedades de la relacion o atributo

        //agregar la relacion o atributo
        add(panelOpciones, BorderLayout.SOUTH);
        add(panelClientes, BorderLayout.CENTER);
        updateListaClientes();
    }

    public void addCliente(Date fechaNacimiento, String nombre) {
        control.addCliente(fechaNacimiento, nombre);        
        updateListaClientes();
    }

    public String getListDataClientes() {
        return control.getListDataClientes();
    }

    public void updateListaClientes() {
        panelClientes.updateListaClientes(control.getListClients());
    }

}
