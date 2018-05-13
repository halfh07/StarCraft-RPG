package juegorol.Zergs;

public class Roach extends Zerg{
    public Roach(){
        this.size=(float) 1;
        this.cargo=2;
        this.armor=1;
        this.health=145;
        this.ataque=16;
        this.cooldown= 1;
        this.rango=4;
        this.vista=9; 
   }
   public Roach(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
