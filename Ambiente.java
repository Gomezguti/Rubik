package rubik;

public class Ambiente  {
    
    Cubo_grafica cubo = new Cubo_grafica();
    
    private int Matriz[][];
    private int n;
    private int Cmov;
    private int Maux[][];
    private int Vauxx[];
    private int Vauxy[];
    private int movimiento;

    public Ambiente(Cubo_grafica cubo, int[][] Matriz) {
        this.cubo = cubo;
        this.Matriz = Matriz;
        n = Matriz[0].length/4;
        Cmov = ((n-2)*6)+12; 
    }

    public void mover(int mov)
    {
        Maux = new int[n][n];
        Vauxx = new int[Matriz[0].length];
        Vauxy = new int[Matriz.length];


      
        
        switch(mov)
        {
            case 0:
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Maux[a][b] = Matriz[n-b-1][n+a];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    if (a<3*n)
                    {
                        Vauxx[a]=Matriz[n][a+n];
                    }
                    else
                    {
                        Vauxx[a]=Matriz[n][a-(3*n)];

                    }
                }
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Matriz[a][b+n] = Maux[a][b];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    
                    Matriz[n][a]= Vauxx[a] ;
                }
                break;
            case 1:  
                
                
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Maux[a][b] = Matriz[b][(2*n-1)-a];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    if (a<n)
                    {
                        Vauxx[a]=Matriz[n][a+3*n];
                    }
                    else
                    {
                        Vauxx[a]=Matriz[n][a-n];
                    }
                }
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Matriz[a][b+n] = Maux[a][b];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    Matriz[n][a]= Vauxx[a] ;
                }
                break;
            case 2:
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Maux[a][b] = Matriz[(3*n-1)-b][n+a];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    if (a<n)
                    {
                        Vauxx[a]=Matriz[2*n-1][a+3*n];
                    }
                    else
                    {
                        Vauxx[a]=Matriz[2*n-1][a-n];
                    }
                }
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Matriz[a+(2*n)][b+n] = Maux[a][b];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    Matriz[2*n-1][a]= Vauxx[a] ;
                }
                break;
            case 3:
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Maux[a][b] = Matriz[2*n+b][(2*n-1)-a];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    if (a<3*n)
                    {
                        Vauxx[a]=Matriz[2*n-1][a+n];
                    }
                    else
                    {
                        Vauxx[a]=Matriz[2*n-1][a-(3*n)];
                    }
                }
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Matriz[a+(2*n)][b+n] = Maux[a][b];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    Matriz[2*n-1][a]= Vauxx[a] ;
                }
                break;
            case 4:
                
                
                
                
                
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Maux[a][b] = Matriz[n-b-1][n+a];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    if (a<3*n)
                    {
                        Vauxx[a]=Matriz[n][a+n];
                    }
                    else
                    {
                        Vauxx[a]=Matriz[n][a-(3*n)];

                    }
                }
                
                
                
                for (int a = 0 ; a<n;a++)
                {
                    for(int b = 0 ; b<n;b++)
                    {
                        Matriz[a][b+n] = Maux[a][b];
                    }
                }
                for(int a = 0 ; a < Matriz[n].length; a++)
                {
                    
                    Matriz[n][a]= Vauxx[a] ;
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }
        
        if(mov >12 && Cmov >12)
        {
            System.out.println(mov);
            System.out.println(Cmov);
        }
        cubo.setMatriz(Matriz);
        

        //return Matriz;
    }

    public int getCmov() {
        return Cmov;
    }

}
