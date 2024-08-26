package rubik;
public class ClasePrincipal {

    private Ventana ventana;
    private int n;

    
    public void Ejecutar()
    {
        ventana = new Ventana();

        while(true)
        {
            ventana.repaint();
            Retardo(250);
        }
        
    }
    public static void main(String[] args) {
        new ClasePrincipal().Ejecutar();
    }
    private void Retardo(int lapse)
    {
        try{Thread.sleep(lapse);}
        catch (InterruptedException ex){}
        
    }

    public void setMatriz(int n) {
        this.n = n;


    }

}
