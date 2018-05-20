package juegorol.Terrans;

public class SiegeTank extends Terran{
        public SiegeTank(){
        this.size=(float) 1.75;
        this.cargo=4;
        this.armor=0;
        this.health=140;
        this.ataque=28;
        this.cooldown= 2;
        this.rango=7;
        this.vista=11; 
         this.bonus=1.1;
         this.puntosunidad=3;
   }
   public SiegeTank(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int bonus,int puntosunidad)
   {      
   }
}
