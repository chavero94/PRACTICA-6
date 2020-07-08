import java.util.Scanner;
public class Pila 
{

    Scanner teclado=new Scanner(System.in);
    Nodo Max;
    public Pila(int MAXI)
    {
        MAXI=100;
        Max=null;
    }
    public void Agregar()
    {
        Nodo Pila = new Nodo();
        System.out.println("\n añada un dato: ");
        Pila.info=teclado.nextInt();
        Pila.Sig=Max;
        Max=Pila;
        System.out.println("\n Se agrego el dato");
    }
    public void  Desplegar()
    {
        Nodo mostrar=new Nodo();
        mostrar=Max;
        if(Max!=null)
        {
            while(mostrar!=null)
            {
                System.out.println(" "+mostrar.info);
                mostrar=mostrar.Sig;
            }
            
        }
        else
        {
           System.out.println("Esta vacia"); 
        }
    }
    public void Eliminar()
    {
       Nodo eliminar=new Nodo();
       eliminar=Max;
       Nodo buscador=new Nodo();
       buscador=null;
       boolean verificar=false;
       System.out.println("Ingrese dato: ");
       int numeroeliminar=teclado.nextInt();
       if(Max!=null)
       {
           while(eliminar!=null&&verificar!=true)
           {
               if(eliminar.info==numeroeliminar)
               {
                   if(eliminar==Max)
                   {
                       Max=Max.Sig;
                   }
                   else
                   {
                       buscador.Sig=eliminar.Sig;
                   }
                   System.out.println("\nSe a eliminado el dato");
                   verificar=true;
               }
               buscador=eliminar;
               eliminar=eliminar.Sig;
           }
           if(!verificar)
           {
               System.out.println("no existe ese numero");
           }  
       }
       else
       {
           System.out.println("\n La pila esta vacia");
       }
    }
    
    public void Buscar()
    {
        Nodo Buscar=Max;
        boolean Encontrar=false;
        System.out.println("\n Que dato buscara");
        int Buscado=teclado.nextInt();
        int lugar=0;
        if(Max!=null)
        {
            while(Buscar!=null&&!Encontrar)
            {
               if(Buscar.info==Buscado)
               {
                   if(lugar>=0)
                   {
                       System.out.println("\n Se encontro el numero en el lugar: "+lugar);
                       Encontrar=true;
                   
                   }
               }
               Buscar=Buscar.Sig;
               lugar++;
            }
            if(!Encontrar)
            {
                System.out.println("\n no se encontro este dato");
            }
            else
            {
               
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) 
    {
        int x=0,opcion;
        Scanner teclado=new Scanner(System.in);
        System.out.println("\n De que tamaño es la pila");
        x=teclado.nextInt();
        Pila Menu = new Pila(x);
       do
       {
        System.out.println("1.-Agrega datos");
        System.out.println("2.-desplegar pila");
        System.out.println("3.-elimina datos");
        System.out.println("4.-bsca un dato");
        System.out.println("5.-salir");
        opcion=teclado.nextInt();
                switch(opcion)
                {
                    case 1:
                    {
                        System.out.println("cuantos datos agregara: ");
                        int agregar=teclado.nextInt();
                        for(int i=0;i<agregar;i++)
                        {
                            Menu.Agregar();
                        }
                        break;
                    }
                    
                    case 2:
                    {
                        Menu.Desplegar();
                        break;
                    }
                    case 3:
                    {
                        Menu.Eliminar();
                        break;
                    }
                    case 4:
                    {
                        Menu.Buscar();
                        break;
                    }
                }
       }
       while(opcion!=5);
    }
    
}
