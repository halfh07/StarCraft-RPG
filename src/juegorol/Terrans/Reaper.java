package juegorol.Terrans;

public class Reaper extends Terran{
        public Reaper(){
        this.size=(float) .75;
        this.cargo=1;
        this.armor=0;
        this.health=60;
        this.ataque=4;
        this.cooldown= 0;
        this.rango=5;
        this.vista=9; 
         this.bonus=3.2;
         this.puntosunidad=1;
   }
   public Reaper(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int bonus,int puntosunidad)
   {      
   }    
}
