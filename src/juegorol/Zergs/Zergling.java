package juegorol.Zergs;

public class Zergling extends Zerg{
   public Zergling(){
        this.size=(float) 0.75;
        this.cargo=1;
        this.armor=0;
        this.health=35;
        this.ataque=5;
        this.cooldown=0;
        this.rango=1;
        this.vista=8; 
   }
   public Zergling(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {
   }
 /*     public void setSize(float size){
      this.size=size;
   }
   public void setCargo(float cargo){
       this.cargo=cargo;
   }
   public void setArmor(int armor){
       this.armor=armor;
   }
   public void setHealth(int health){
       this.health=health;
   }
   public void setAtaqueT(int ataqueT){
       this.ataqueT=ataqueT;
   }
   public void setAtaqueA(int ataqueA){
       this.ataqueA=ataqueA;
   }
   public void setCooldown(float cooldown){
       this.cooldown=cooldown;
   }
   public void setRango(int rango){
       this.rango=rango;
   }
   public void setVista(int vista){
       this.vista=vista;
   }*/

}
