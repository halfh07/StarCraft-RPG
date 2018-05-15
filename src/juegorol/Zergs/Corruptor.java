package juegorol.Zergs;

public class Corruptor extends Zerg{
    public Corruptor(){
        this.size=(float) 1.25;
        this.cargo=0;
        this.armor=2;
        this.health=200;
        this.ataque=14;
        this.cooldown= 1;
        this.rango=6;
        this.vista=10; 
   }
   public Corruptor(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
