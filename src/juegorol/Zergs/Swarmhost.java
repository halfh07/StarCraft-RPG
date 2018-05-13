package juegorol.Zergs;

 public class Swarmhost extends Zerg{
   public Swarmhost(){
        this.size=(float) .75;
        this.cargo=0;
        this.armor=0;
        this.health=50;
        this.ataque=12;
        this.cooldown= 0;
        this.rango=3;
        this.vista=6; 
   }
   public Swarmhost(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
