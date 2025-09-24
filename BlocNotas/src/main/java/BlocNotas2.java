import javax.swing.*;

public class BlocNotas2 {

    private JPanel PanelBloc2;
    private JComboBox ComboIdioma;
    private JLabel LabelIdioma;
    private JLabel LabelUsuario2;
    private JTextField textUsuario2;
    private JLabel Contraseña2;
    private JPasswordField textContraseña2;
    private JRadioButton recordarUsuarioRadioButton;
    private JCheckBox aceptarTérminosYCondicionesCheckBox;
    private JButton accederButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BlocNotas2");
        frame.setContentPane(new BlocNotas2().PanelBloc2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
