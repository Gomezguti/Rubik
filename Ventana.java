package rubik;

import javax.swing.*;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.File;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Ventana extends JFrame implements ActionListener  {
    
    private ClasePrincipal clase= new ClasePrincipal();

    private JLabel Titulo;
    private JPanel panelDerecho;
    private JButton Ingresar;
    private JButton Inicio;
    private JButton Parar;
    private JButton Cargar;
    private JTextField Num_n;
    private Cubo_grafica cubo;
    //private Tablas VectorT;
    //private Tablas SolucionT;
    private Tablas MatrizCognitiva;
    private Ambiente ambiente;
    private Agente agent;


    
    
    
    private int n;
    private String titulo_MC[] = new String[] {"E", "A", "C", "B", "D"};
    public Object MC[][] = new Object[][] {{1,2,2,4,5},
                                             {1,2,2,4,5},
                                             {1,2,2,4,5},};
    private int matriz [][] = new int [n*3][n*4];
    private Archivo archivo = new Archivo() ;


    
    
    

    public Ventana() {
        
        
        
        setSize(1300, 850);
        setResizable(false);
        setLocation(200, 150);
        setTitle("Solucion Cubo de Rubik");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        Container contenedor = new Container();
        contenedor.setBackground(Color.white);
        setContentPane(contenedor);
        
        
        cubo = new Cubo_grafica();
        cubo.setBounds(10, 10, 780, 790);
        contenedor.add(cubo);

        
        
        // contenedor de la parte derecha
        panelDerecho = new JPanel();
        panelDerecho.setBounds(800, 0, 500, 850);
        panelDerecho.setBackground(Color.LIGHT_GRAY);
        panelDerecho.setLayout(null);  
        contenedor.add(panelDerecho);
        

        MatrizCognitiva = new Tablas(MC, titulo_MC);
        MatrizCognitiva.setBounds(10, 200, 300, 300);
        panelDerecho.add(MatrizCognitiva);

        
        Titulo = new JLabel("Solucion Cubo de Rubik");
        Titulo.setFont(new Font("SansSerif", Font.PLAIN, 18));
        Titulo.setBounds((panelDerecho.getWidth()-200)/2, 10, 200, 27);
        panelDerecho.add(Titulo);
        
        Num_n = new JTextField();
        Num_n.setBounds(20, 60, 100, 27);
        Num_n.setText("Ingrese N");
        panelDerecho.add(Num_n);
        
        Ingresar = new JButton("Ingresar");
        Ingresar.setBounds(150, 60, 100, 27);
        Ingresar.setActionCommand("Ingresar");
        Ingresar.addActionListener(this);
        panelDerecho.add(Ingresar);
        
        Cargar = new JButton("Cargar Archivo");
        Cargar.setBounds((panelDerecho.getWidth()-120)/2, 120, 120, 27);
        Cargar.setActionCommand("Cargar");
        Cargar.addActionListener(this);
        panelDerecho.add(Cargar);
        
        Inicio = new JButton("Inicio");
        Inicio.setBounds(10, 550, 100, 27);
        Inicio.setActionCommand("Inicio");
        Inicio.addActionListener(this);
        panelDerecho.add(Inicio);
        
        Parar = new JButton("Parar");
        Parar.setBounds(170, 550, 100, 27);
        Parar.setActionCommand("Parar");
        Parar.addActionListener(this);
        panelDerecho.add(Parar);
        
        
        

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        switch (comando) {
            case "Ingresar":
                try {
                    n = Integer.parseInt(Num_n.getText());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número entero válido.");
                }
                
                break;
            case "Cargar":
                archivo.seleccionarArchivo();
                archivo.AbrirArchivo();
                matriz = archivo.LeerArchivo();
                cubo.setMatriz(matriz);
                ambiente = new Ambiente(cubo, matriz);
                agent = new Agente(ambiente);

                
                

                
                
                this.repaint();
                
                
                break;
            case "Inicio":
                
                


                System.out.println("Inicio botón presionado");
                break;
            case "Parar":
                agent.iniciar();
                

                System.out.println("Parar botón presionado");
                break;
            default:

                System.out.println("Comando no reconocido");
                break;
        }
    }


    
}
