/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author User
 */

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        // A implementação do som pode variar para cada animal, então deixaremos abstrato
        // e será implementado nas classes filhas
    }

    public void mover() {
        // O método mover também é abstrato, pois cada animal se move de maneira diferente
        // e será implementado nas classes filhas
    }

    // Getters e setters para nome e idade
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}



