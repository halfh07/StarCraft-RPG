package juegorol.Terrans;

public class Thor extends Terran{
        public Thor(){
        this.size=(float) 2;
        this.cargo=8;
        this.armor=1;
        this.health=400;
        this.ataque=45;
        this.cooldown= 3;
        this.rango=7;
        this.vista=11; 
         this.bonus=3;
         this.puntosunidad=3;
   }
   public Thor(float size,float cargo,int armor,int health,int ataque,
                   int cooldown,int rango,int vista,double bonus,int puntosunidad)
   {      
   }
}
