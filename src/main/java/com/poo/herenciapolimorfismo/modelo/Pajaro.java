
package com.poo.herenciapolimorfismo.modelo;


public class Pajaro extends Animal{
    
    private float altura;

    public Pajaro(float altura, String nombre) {
        super(nombre);
        this.altura= altura;
        
    }
    public Pajaro(String nombre) {
        super(nombre);
        this.altura= 0;
        
    }
    
    
    private void volar(){
        this.altura+=10;
        System.out.println("Altura actual: "+ this.altura);
    }
    
    
    
}
