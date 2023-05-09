package com.mycompany.exercicioredefinicao;

/**
 *
 * @author Ferna
 */
public class ExercicioRedefinicao {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fazerBarulho();
        
        animal = new Cachorro();
        animal.fazerBarulho();
        
        animal = new Gato();
        animal.fazerBarulho();
    }
}
