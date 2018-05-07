/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcraft.rpg;

/**
 *
 * @author Alons
 */
public class herramientas {
    
}
class Dado {
    int tirar() {
        return 1 + (int)(6 * Math.random());
    }
}