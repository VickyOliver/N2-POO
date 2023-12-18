/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal2;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
   
        Animal2 cachorro = new Cachorro();
        Animal2 gato = new Gato();
        Animal2 passaro = new Passaro();

        cachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();
    }
}
