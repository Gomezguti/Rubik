
package rubik;


public class Agente {
    
    Ambiente ambiente;

    public Agente(Ambiente amb) {
        this.ambiente = amb;

        //amb.mover(2);
        //amb.mover(3);

        

    }
    public void iniciar()
    {
        ambiente.mover(0);
        Retardo(1000);
        ambiente.mover(3);
        Retardo(250);

    }
    
private void Retardo(int lapse)
    {
        try{Thread.sleep(lapse);}
        catch (InterruptedException ex){}
        
    }
    
    
    
}
