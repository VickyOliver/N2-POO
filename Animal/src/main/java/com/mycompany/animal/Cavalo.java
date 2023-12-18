/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author User
 */
public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }
}