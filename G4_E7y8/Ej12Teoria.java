/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01.G4_E7y8;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ej12Teoria {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa dos números");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        Multi(num1, num2);
    }
    
        public static void Multi(int num1, int num2) {
        if (num1 < num2) {
            if (num2 % num1 == 0) {
                System.out.println("El primer número es múltiplo");
            } else {
                System.out.println("El primer número NO es múltiplo");
            }
        } else if (num1 == num2) {
            System.out.println("Los números son iguales, por lo que si son múltiplos");
        } else {
            if (num1 % num2 == 0) {
                System.out.println("El segundo número es múltiplo");
            } else {
                System.out.println("El segundo número NO es múltiplo");
            }
        }
    }
    
}
