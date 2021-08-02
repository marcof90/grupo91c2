package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOpciones extends JPanel implements ActionListener{

    public final static String BTN_CREAR = "Crear usuario";
    public static final String BTN_LISTAR = "Listar usuarios";

    private JButton btnCrear;
    private JButton btnListar;

    public PanelOpciones() {
        super();
        setBorder(new TitledBorder("Opciones"));
        setLayout(new GridLayout(1, 2));

        btnCrear = new JButton(BTN_CREAR);
        btnListar = new JButton(BTN_LISTAR);

        btnCrear.setActionCommand(BTN_CREAR);
        btnListar.setActionCommand(BTN_LISTAR);;

        btnCrear.addActionListener(this);
        btnListar.addActionListener(this);

        add(btnCrear);
        add(btnListar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals(BTN_CREAR)) {
            System.out.println("Vas a crear un usuario");
        }
        else if(e.getActionCommand().equals(BTN_LISTAR)){
            System.out.println("Vas a listar usuarios");
        }
    }

}
