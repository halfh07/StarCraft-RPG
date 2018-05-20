package juegorol.Zergs;

public class Ravanger extends Zerg{
       public Ravanger(){
        this.size=(float) 1.5;
        this.cargo=4;
        this.armor=0;
        this.health=120;
        this.ataque=16;
        this.cooldown=1;
        this.rango=6;
        this.vista=9; 
        this.puntosunidad=2;
   }
   public Ravanger(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int puntosunidad)
   {      
   }
}
