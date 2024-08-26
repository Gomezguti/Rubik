package rubik;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;


public class Tablas extends JPanel {
    private JTable Datos;
    private JScrollPane scrollPane;
    private Object datos[][] ;
    private int Data[][];

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }


    

    public Tablas(Object Data[][], String Titles[])
    {
        super(new GridLayout(1, 1));
        
        Datos = new JTable(Data, Titles);
        Datos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Datos.setEnabled(true);
        
        scrollPane = new JScrollPane(Datos);
        add(scrollPane);
    
    }
}
