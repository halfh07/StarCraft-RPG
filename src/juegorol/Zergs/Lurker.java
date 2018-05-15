package juegorol.Zergs;

public class Lurker extends Zerg{
        public Lurker(){
        this.size=(float) 1.5;
        this.cargo=4;
        this.armor=1;
        this.health=200;
        this.ataque=20;
        this.cooldown= 1;
        this.rango=9;
        this.vista=10; 
   }
   public Lurker(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }    
}
