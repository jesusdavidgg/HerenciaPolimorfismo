/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pez extends Animal {
    
    private int profundidad;
    
    
    public Pez(String nombre, int profundidad) {
        super(nombre);
        this.profundidad = 0;
    }
    
   public Pez() {
        super("Doris");
    }
   
   
    public void nadar(){
        System.out.println("Profundidad: "+ profundidad);
        
    }
    
    
    
     @Override
  public void hacerSonido() {
    System.out.println(super.getNombre()+ " hace Glu Glu");
  }
    
  
  
  public void comer() {
      System.out.println("Comió");
   
  }  
  public void comer(int numero) {
      System.out.println("Comió "+numero+"pecesitos");
      
   
  }
  
}
