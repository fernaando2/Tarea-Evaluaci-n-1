import javax.swing.*;

public class BlocNotas {
    private JPanel PanelBloc;
    private JTextField TextUsuario;
    private JLabel Jlabel_Usuario;
    private JPasswordField TextContraseña;
    private JLabel Jlabel_Contraseña;
    private JCheckBox TerminoyCondiciones;
    private JButton Acceder;
    private JLabel Logo;
    private JLabel Usuario2;
    private JLabel Contraseña2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BlocNotas");
        frame.setContentPane(new BlocNotas().PanelBloc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
