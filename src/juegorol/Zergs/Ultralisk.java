package juegorol.Zergs;

public class Ultralisk extends Zerg{
   public Ultralisk(){
        this.size=(float) 2.0;
        this.cargo=8;
        this.armor=2;
        this.health=500;
        this.ataque=35;
        this.cooldown= 3;
        this.rango=1;
        this.vista=8; 
        this.puntosunidad=5;
   }
   public Ultralisk(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}

