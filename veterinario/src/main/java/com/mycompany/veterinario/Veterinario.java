/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinario;

/**
 *
 * @author User
 */
class Veterinario {
    public void examinar(Animal animal) {
        System.out.print("Examinando... ");
        animal.nomeAnimal();
        animal.emitirSom();
    }
}

