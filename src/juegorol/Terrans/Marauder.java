package juegorol.Terrans;

public class Marauder extends Terran{
        public Marauder(){
        this.size=(float) 1.125;
        this.cargo=2;
        this.armor=1;
        this.health=125;
        this.ataque=10;
        this.cooldown= 1;
        this.rango=5;
        this.vista=10; 
         this.bonus=1.3;
         this.puntosunidad=2;
   }
   public Marauder(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,double bonus,int puntosunidad)
   {      
   }
}
