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
        this.ctCurarse=18;
        this.puntosunidad=5;
   }
   public Ultralisk(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int ctCurarse, int puntosunidad)
   {      
   }
}

