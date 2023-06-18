import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Interfaz extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton registrarButton;
    private JButton mostrarButton;
    private JPanel contenedor;
    private static ArrayList<Numero> numeroArrayList = new ArrayList<>();

    public Interfaz(){
        setupFrame();
        add(contenedor);
        addListeners();
    }
    private void setupFrame() {
        setTitle("Formulario Estudiantes");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(300, 230);
    }
    private void addListeners(){
        mostrarButton.addActionListener(e -> {
            setVisible(false);
            new Mostrar1();
        });
        registrarButton.addActionListener(e -> {
            registrar();
            limpiar();
        });
    }
    private void registrar(){
        String nombre =  textField1.getText();
        String apellido =  textField2.getText();
        String numero =  textField3.getText();
        String correo =  textField4.getText();
        String dia =  textField5.getText();
        String mes =  textField6.getText();
        numeroArrayList.add(new Numero(numero,apellido,correo,nombre,dia,mes));
        limpiar();
    }
    private void limpiar(){
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
    }

    public static ArrayList<Numero> getNumeroArrayList() {
        return numeroArrayList;
    }
}
