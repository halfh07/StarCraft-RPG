package juegorol.Terrans;

public class Ghost extends Terran{
        public Ghost(){
        this.size=(float) .75;
        this.cargo=2;
        this.armor=0;
        this.health=100;
        this.ataque=10;
        this.cooldown= 1;
        this.rango=6;
        this.vista=11; 
         this.bonus=1.4;
   }
   public Ghost(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
