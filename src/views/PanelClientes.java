package views;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;

public class PanelClientes extends JPanel{
    
    private VistaPrincipal vistaPrincipal;
    private JList<String> listaClientes;

    public PanelClientes(VistaPrincipal vp) {
        super();
        setLayout(new GridLayout());
        setBorder(new TitledBorder("Clientes"));
        vistaPrincipal = vp;
        // String[] nombres = {"Juan","Carlos","Luis","Pedro"};
        // String[] nombres2 = new String[4];
        // nombres2[0] = "Juan";
        // nombres2[1] = "Carlos";
        // nombres2[2] = "Luis";
        // nombres2[3] = "Pedro";
        listaClientes = new JList<>();
        add(listaClientes);
    }

    public void updateListaClientes(String[] listado) {
        listaClientes.setListData(listado);
    }

}
