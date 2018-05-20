package juegorol.Terrans;

public class Liberator  extends Terran{
        public Liberator(){
        this.size=(float) 1.5;
        this.cargo=0;
        this.armor=0;
        this.health=180;
        this.ataque=20;
        this.cooldown= 2;
        this.rango=10;
        this.vista=13; 
        this.bonus=1.1;
        this.puntosunidad=3;
   }
   public Liberator(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
