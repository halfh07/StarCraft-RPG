package juegorol.Terrans;

public class Raven extends Terran{
        public Raven(){
        this.size=(float) 1.25;
        this.cargo=0;
        this.armor=1;
        this.health=140;
        this.ataque=18;
        this.cooldown= 2;
        this.rango=6;
        this.vista=7; 
         this.bonus=1.4;
         this.puntosunidad=2;
   }
   public Raven(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,double bonus,int puntosunidad)
   {      
   }
}
