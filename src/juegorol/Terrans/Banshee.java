package juegorol.Terrans;

public class Banshee extends Terran{
        public Banshee(){
        this.size=(float) 1.5;
        this.cargo=0;
        this.armor=0;
        this.health=140;
        this.ataque=12;
        this.cooldown= 1;
        this.rango=6;
        this.vista=10; 
        this.bonus=1.3;
        this.puntosunidad=2;
   }
   public Banshee(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int bonus,int puntosunidad)
   {      
   }
}
