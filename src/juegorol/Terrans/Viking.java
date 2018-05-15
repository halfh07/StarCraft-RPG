package juegorol.Terrans;

public class Viking extends Terran{
        public Viking(){
        this.size=(float) 1.5;
        this.cargo=2;
        this.armor=0;
        this.health=125;
        this.ataque=16;
        this.cooldown= 1;
        this.rango=6;
        this.vista=10; 
         this.bonus=1.3;
   }
   public Viking(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }    
}
