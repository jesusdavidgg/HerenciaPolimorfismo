/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Perro extends Animal {
    
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza ) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }

    

    public Perro() {
        super("Pongo");
    }
 
    
  @Override
  public void hacerSonido() {
    System.out.println(super.getNombre()+ " hace Guau guau!");
  }
}

