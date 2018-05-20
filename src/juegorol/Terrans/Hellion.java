package juegorol.Terrans;

public class Hellion extends Terran{
        public Hellion(){
        this.size=(float) 1.25;
        this.cargo=2;
        this.armor=0;
        this.health=90;
        this.ataque=8;
        this.cooldown= 1;
        this.rango=5;
        this.vista=10; 
         this.bonus=1.4;
         this.puntosunidad=2;
   }
   public Hellion(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,double bonus,int puntosunidad)
   {      
   }
}
