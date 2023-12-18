/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author User
 */
public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subirEmArvores() {
        System.out.println(getNome() + " está subindo em uma árvore.");
    }

    // Sobrescrevendo o método emitirSom para a preguiça
    @Override
    public void emitirSom() {
        System.out.println("A preguiça emite um som específico.");
    }
}
