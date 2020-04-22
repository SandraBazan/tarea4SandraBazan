/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.sandrabazan;

/**
 *
 * @author San
 */
public class Persona {
    // Atributos
    private String nombre, apellidos, nif;

    // Constructor parametrizado
    public Persona(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    // Constructor por defecto
    public Persona() {
        this.nombre = "Pepe";
        this.apellidos = "Navarro";
        this.nif = "11223344N";
    }
    
    
}
