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
        
        System.out.println("Ingrese un numero: ");
        int n = teclado.nextInt();
        
        if (n%2==0){
            System.out.println("Es un numero par");
        }else{
            System.out.println("No es un numero par");
        }
        teclado.close();
        
    }
}
