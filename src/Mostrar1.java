import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Mostrar1 extends JFrame{
    private JTable table1;
    private JPanel contenedor;
    private JButton regresar;
    private DefaultTableModel modelo;
    private JTable jTable;
    private String[] titulos = {"NOMBRE","APELLIDO","NUMERO","CORREO","DIA","MES"};
    public Mostrar1(){
        initControl();
        configTable();
        configFrame();
        add(contenedor);
        addActionListeners();
    }
    private void addActionListeners() {
        regresar.addActionListener(e -> {
            setVisible(false);
            new Interfaz();
        });
    }
    private void initControl(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(titulos);
        String [] fila = new String[modelo.getColumnCount()];
        ArrayList<Numero> lista = Interfaz.getNumeroArrayList();
        for (Numero userTable : lista) {
            fila[2] = String.valueOf(userTable.getNewNumero());
            fila[1] = userTable.getApellido();
            fila[3] = userTable.getCorreo();
            fila[0] = userTable.getNombre();
            fila[4] = String.valueOf(userTable.getDia());
            fila[5] = userTable.getMes();
            modelo.addRow(fila);
        }
        jTable = new JTable(modelo);
    }
    private void configFrame() {
        setTitle("Tabla de usuarios");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // Establecer BoxLayout vertical
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 300);
        setResizable(true);
        setVisible(true);
    }
    private void configTable() {
        jTable.setGridColor(new Color(88, 214, 141));
        jTable.setPreferredScrollableViewportSize(new Dimension(600, 300));
        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane);
    }
}
