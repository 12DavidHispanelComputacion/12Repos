/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea_paroimpar;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tarea_ParOImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: "); //Esto es para que logremos ingresar cualquier digito media vez sea un numero entero-
        int n = teclado.nextInt(); // Esto es para poder ingrear el valor.
        
        if (n%2==0){ //Esto es para poder diferenciar si es un numero par o impar.
            System.out.println("Es un numero par"); // Esto da un mensaje diciendo que es un numero par.
        }else{ // Esto nos dice que DE OTRO MODO el resultado sea impar.
            System.out.println("No es un numero par");
        }
        teclado.close();
        
    }
}
