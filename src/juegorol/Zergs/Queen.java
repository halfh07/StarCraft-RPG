package juegorol.Zergs;

public class Queen extends Zerg{
       public Queen(){
        this.size=(float) 1.75;
        this.cargo=2;
        this.armor=1;
        this.health=175;
        this.ataque=7;
        this.cooldown= 1;
        this.rango=6;
        this.vista=9; 
   }
   public Queen(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
