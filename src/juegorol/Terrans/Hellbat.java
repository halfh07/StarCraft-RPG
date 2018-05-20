package juegorol.Terrans;

public class Hellbat extends Terran{
        public Hellbat(){
        this.size=(float) 1.25;
        this.cargo=4;
        this.armor=0;
        this.health=135;
        this.ataque=18;
        this.cooldown= 1;
        this.rango=2;
        this.vista=10; 
         this.bonus=1.2;
         this.puntosunidad=2;
   }
   public Hellbat(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,double bonus,int puntosunidad)
   {      
   }
}
