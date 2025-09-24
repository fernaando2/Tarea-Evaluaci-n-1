import javax.swing.*;

public class BlocNotas3 {
    private JTabbedPane LoginvsRegistro;
    private JPanel BlocNotas3;
    private JLabel Usuario3;
    private JLabel LOgoo;
    private JTextField TextUsuario3;
    private JLabel Contra3;
    private JPasswordField TextContraseña3;
    private JProgressBar BarraCarga;
    private JSpinner spinner1;
    private JSlider slider1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BlocNotas3");
        frame.setContentPane(new BlocNotas3().BlocNotas3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
