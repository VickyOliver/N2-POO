/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Preguica preguica = new Preguica("Belinha", 5);
        Cavalo cavalo = new Cavalo("Pé de Pano", 8);
        Cachorro cachorro = new Cachorro("Rex", 3);

        preguica.emitirSom();
        preguica.subirEmArvores();
        cavalo.correr();
        cachorro.emitirSom();
        cachorro.correr();
    }
}

