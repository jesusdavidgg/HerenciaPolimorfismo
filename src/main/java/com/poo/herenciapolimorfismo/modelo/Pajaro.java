
package com.poo.herenciapolimorfismo.modelo;


public class Pajaro extends Animal{
    
    private float altura=0;

    public Pajaro(float altura, String nombre) {
        super(nombre);
        this.altura = altura;
    }
    
    
    private void volar(){
        System.out.println("Altura actual: "+ altura+10);
    }
    
    
    
}
