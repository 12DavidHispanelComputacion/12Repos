/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paroimpar2;

/**
 *
 * @author HP
 */
public class ParOImpar2 {

    Public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Por favor ingrese un numero: ");
    int n = teclado.nextInt();
    
    if (n%2==0){
        System.out.println("Es un numero par");
    }else{
        System.out.println("No es un numero par");
    }
    
    teclado.close();
}
}