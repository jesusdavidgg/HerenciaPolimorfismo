
package com.poo.herenciapolimorfismo.modelo;


public class Pajaro extends Animal{
    
    private float altura;

    public Pajaro(float altura, String nombre) {
        super(nombre);
        this.altura=0;
        
    }
    
    
    private void volar(){
        System.out.println("Altura actual: "+ altura+10);
    }
    
    
    
}
