/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.baloto.modelo;

import java.util.Random;

/**
 *
 * @author Sena
 */
public class Numeros {

    private final int baloto[];

    public Numeros() {
        this.baloto = new int[6];
    }

    public int[] genararNumero() {

        Random random = new Random();

        int var;
int cont=0;
        do {
         for (int i = 0; i < 6; i++) {
            baloto[i]=random.nextInt(45)+1;
        }
       
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (baloto[i] > baloto[i + 1]) {
                    int temp = baloto[i];
                    baloto[i] = baloto[i + 1];
                    baloto[i + 1] = temp;
                }

            }

        }
         for (int i = 0; i < 5; i++) {
            if (baloto[i]==baloto[i+1]) {
                 cont=1;
            }
        }
        } while (cont>=1);
        
        

        return baloto;
    }

   

}
