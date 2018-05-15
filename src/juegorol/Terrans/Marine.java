package juegorol.Terrans;

public class Marine extends Terran{
        public Marine(){
        this.size=(float) .75;
        this.cargo=1;
        this.armor=0;
        this.health=45;
        this.ataque=6;
        this.cooldown= 0;
        this.rango=5;
        this.vista=9; 
         this.bonus=2;
   }
   public Marine(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
