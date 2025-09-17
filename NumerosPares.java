/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospares;

/**
 *
 * @author Diogenes
 */
public class NumerosPares {

    public static void main(String[] args) {
    
 
        // Exercício 1: Explorar todos os números pares existentes entre 1 e 20
        
        System.out.println("Números pares entre 1 e 20:");
        
        // Percorremos todos os números de 1 a 20
        for (int numero = 1; numero <= 20; numero++) {
            // Verificamos se o número é par (resto da divisão por 2 é igual a 0)
            if (numero % 2 == 0) {
                System.out.print(numero + " "); // Exibimos o número par
            }
        }
    }
}
    
