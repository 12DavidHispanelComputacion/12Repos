
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Tarea {
    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese primer numero: ");
            int n = teclado.nextInt();
            
            if (n%2==0){
                System.out.println("Es un numero par.");
            }else{
                System.out.println("No es un numero par.");
            }       }
    }
}