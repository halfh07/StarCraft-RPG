package juegorol;

import java.util.Scanner;
public class Mensajes extends AtributosGlobales{
   
            
        int nuZergling;
        int nuSwarmhost;
        int nuUltralisk;
        int nuRoach;
        int puntos=10;
        int seleccionUnidades;
        int ptsGastados=0;
        

    public void MenuInicial(){
    int seleccionRaza;

        
        System.out.println("Juego de rol basado en starcraft <3");
        Scanner entrada1= new Scanner (System.in);
        System.out.println("Elige una raza \n1.-Zergs\n2.-Protoss\n3.-Terrans\nSeleccion: ");
        seleccionRaza= entrada1.nextInt();
        switch (seleccionRaza) {
            case 1:
                System.out.println("Has seleccionado Zergs");
                    
                    do{
                       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                       System.out.println("Selecciona tus unidades cuentas con "+puntos+" puntos para gastar");
                       System.out.println("\nUnidad\t\tCosto de pts.\tTu equipo\n\n1.Zergling\t2pts\t\tZergling: "+nuZergling
                          +"\n2.Roach\t\t3pts.\t\tRoach: "+nuRoach
                          +"\n3.Swarmhost\t4pts.\t\tSwarmhost: "+nuSwarmhost
                          +"\n4.Ultralisk\t5pts.\t\tUltralisk: "+nuUltralisk
                          +"\n\nIntroduce los numeros correspondientes para seleccionar tus unidades: ");
                        seleccionUnidades=entrada1.nextInt();
                        switch(seleccionUnidades){
                          case 1:
                             ptsGastados=2;
                             if(puntos>=ptsGastados){
                             nuZergling=nuZergling+1;
                             }
                          break;     
                          case 2:
                             ptsGastados=3;
                             if(puntos>=ptsGastados){
                             nuRoach=nuRoach+1;
                             }              
                          break;
                          case 3:
                             ptsGastados=4;
                             if(puntos>=ptsGastados){
                             nuSwarmhost=nuSwarmhost+1;
                             }
                          break; 
                          case 4:
                             ptsGastados=5;
                             if(puntos>=ptsGastados){
                             nuUltralisk=nuUltralisk+1;
                             }
                          break;    
                          default:
                             System.out.println("Comando invalido");   
                             try{
                             Thread.sleep(2000);
                             }catch(Exception ex){
                             ex.printStackTrace();
                             }
                          break;      
                        }
                puntos= puntos - ptsGastados; 
                if(puntos<0){
                   puntos= puntos + ptsGastados;
                   System.out.println("Buen intento... pero solo tienes "+puntos+" puntos");
                   try{
                   Thread.sleep(2000);
                   }catch(Exception ex){
                   ex.printStackTrace();
                   }
                }
                }while(puntos>0 && puntos!=1);
            break;
            case 2:
                System.out.println("Has seleccionado Protoss");
                break;
            case 3:
                System.out.println("Has seleccionado Terrans");
                break;
            default:
                System.out.println("comando invalido, como tu cerebro");
                break;
        }

    }
}
