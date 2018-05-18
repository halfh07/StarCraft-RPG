//UNO RAPIDO
package juegorol;
import java.util.Arrays;
import juegorol.Protoss.Carrier;
public class AtributosGlobales 
{
    public float size;
    public float cargo;
    public int armor;
    public int health;
    public int ataque;
    public int cooldown;
    public int rango;
    public int vista;
    public int puntosunidad;
    
    
    
public float getSize(){
       return this.size;
   }
public float getCargo(){
       return this.cargo;
   }
public int getArmor(){
       return this.armor;
   }
public int getHealth(){
       return this.health;
   }

public int getAtaque(){
       return this.ataque;
   }
public float getCooldown(){
       return this.cooldown;
   }
public int getRango(){
       return this.rango;
   }
public int getVista(){
       return this.vista;
   }
    
    public void atacar ()
        {
    
        }
    
    public void avanzar ()
        {
        
        }
    
    public void UsarItem ()
        {
        
        }
    
    public void defender ()
        {
        
        }

public static void main(String[] args) 
    {

        Carrier a=new Carrier();
        System.out.println("TEST DE ATRIBUTOS GLOBALES DE CADA CLASE");
        System.out.println (a.getSize());
        System.out.println (a.getCargo());
        System.out.println (a.getArmor());
        System.out.println (a.getHealth());
        System.out.println (a.getshield());
        System.out.println (a.getAtaque());
        System.out.println (a.getCooldown());
        System.out.println (a.getRango());
        System.out.println (a.getVista());
    Mensajes jugador=new Mensajes();
    jugador.MenuInicial();

} 
