
package com.poo.herenciapolimorfismo.modelo;


public class PerroGrande extends Perro {
    
    private float pesoKG;

    public PerroGrande(String nombre, int edad, String raza, float pesoKG) {
        super(nombre, edad, raza);
        this.pesoKG = pesoKG;
    }

    public float getPesoKG() {
        return pesoKG;
    }

   
    @Override
    public void hacerSonido(){
        System.out.println("¡¡GUAU!!");
    }


    
    
    
}
