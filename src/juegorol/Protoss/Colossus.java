package juegorol.Protoss;
public class Colossus extends Protoss 
{
   public Colossus()
   {
        this.size= (float) 2;
        this.cargo=8;
        this.armor=1;
        this.health=200;
        this.shield=150;
        this.ataque=20;
        this.cooldown=1;
        this.rango=7;
        this.vista=10;
        this.puntosunidad=3;
   }
   public Colossus(float size, float cargo,int armor, int health,int shield, int ataque, int cooldown, int rango, int vista, int puntosunidad)
   {
       
   }
}
