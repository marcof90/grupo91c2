package views;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PanelOpciones extends JPanel implements ActionListener{

    public final static String BTN_CREAR = "Crear usuario";
    public static final String BTN_LISTAR = "Listar usuarios";

    private JButton btnCrear;
    private JButton btnListar;

    private VistaPrincipal vistaPrincipal;

    public PanelOpciones(VistaPrincipal vp) {
        super();
        setBorder(new TitledBorder("Opciones"));
        setLayout(new GridLayout(1, 2));

        vistaPrincipal = vp;

        btnCrear = new JButton(BTN_CREAR);
        btnListar = new JButton(BTN_LISTAR);

        btnCrear.setActionCommand(BTN_CREAR);
        btnListar.setActionCommand(BTN_LISTAR);;

        btnCrear.addActionListener(this);
        btnListar.addActionListener(this);

        add(btnCrear);
        add(btnListar);
    }

    public void addCliente() {
        String nombre = JOptionPane.showInputDialog(vistaPrincipal, "Nombre del cliente");
        String fecha = JOptionPane.showInputDialog(vistaPrincipal, "Fecha de nacimiento dd/MM/yyyy");
        Date fechaN;
        try {
            fechaN = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            vistaPrincipal.addCliente(fechaN, nombre);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void getListDataClientes() {
        JOptionPane.showMessageDialog(vistaPrincipal, vistaPrincipal.getListDataClientes());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(BTN_CREAR)) {
            addCliente();
        }
        else if(e.getActionCommand().equals(BTN_LISTAR)){
            getListDataClientes();
        }
    }

}
