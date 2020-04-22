/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.sandrabazan;

/**
 *
 * @author josel
 */
public class Prueba {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Marzoco", "Mazorquito", "09546521F");
        
        
        p1.toString();
        p2.toString();
        
        p1.getNombre();
        p2.getNombre();
    }
}
