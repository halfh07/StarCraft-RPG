package juegorol.Zergs;

public class Baneling extends Zerg{
   public Baneling(){
        this.size=(float) 0.75;
        this.cargo=2;
        this.armor=0;
        this.health=30;
        this.ataque=20;
        this.cooldown= 0;
        this.rango=1;
        this.vista=8; 
        this.ctCurarse=2;
        this.puntosunidad=1;
   }
   public Baneling(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int ctCurarse,int puntosunidad)
   {      
   }
}
