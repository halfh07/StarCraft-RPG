package juegorol.Zergs;

public class Hydralisk extends Zerg{
       public Hydralisk(){
        this.size=(float) 1.25;
        this.cargo=2;
        this.armor=0;
        this.health=90;
        this.ataque=12;
        this.cooldown=1;
        this.rango=5;
        this.vista=9; 
   }
   public Hydralisk(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
