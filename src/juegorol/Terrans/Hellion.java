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
   }
   public Hellion(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
