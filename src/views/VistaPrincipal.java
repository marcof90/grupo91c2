package views;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class VistaPrincipal extends JFrame{

    //crear la relacion o atributo
    private PanelOpciones panelOpciones;
    
    public VistaPrincipal() {
        super();
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Billetera digital");
        setLayout(new BorderLayout());

        //inicializar la relacion o atributo
        panelOpciones = new PanelOpciones();

        //modificar las propiedades de la relacion o atributo

        //agregar la relacion o atributo
        add(panelOpciones, BorderLayout.SOUTH);
    }

}
