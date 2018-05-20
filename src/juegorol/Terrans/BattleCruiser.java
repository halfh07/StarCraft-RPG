package juegorol.Terrans;

public class BattleCruiser extends Terran{
        public BattleCruiser(){
        this.size=(float) 2.5;
        this.cargo=0;
        this.armor=3;
        this.health=550;
        this.ataque=7;
        this.cooldown= 0;
        this.rango=6;
        this.vista=12; 
         this.bonus=1.1;
         this.puntosunidad=4;
   }
   public BattleCruiser(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int bonus,int puntosunidad)
   {      
   }
}
