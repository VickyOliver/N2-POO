/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinario;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
     
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();
        Veterinario veterinario = new Veterinario();

       
        veterinario.examinar(cachorro);
        veterinario.examinar(gato);
        veterinario.examinar(passaro);
    }
}
