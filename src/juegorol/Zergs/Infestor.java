package juegorol.Zergs;

public class Infestor extends Zerg{
    public Infestor(){
        this.size=(float) .75;
        this.cargo=0;
        this.armor=0;
        this.health=50;
        this.ataque=8;
        this.cooldown= 1;
        this.rango=5;
        this.vista=9; 
        this.ctCurarse=2;
        this.puntosunidad=3;
   }
   public Infestor(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,int ctCurarse,int puntosunidad)
   {      
   }
}
