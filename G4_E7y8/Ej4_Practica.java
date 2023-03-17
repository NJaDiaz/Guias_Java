/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01.G4_E7y8;

import java.util.Scanner;


public class Ej4_Practica {

    static Scanner read = new Scanner(System.in) . useDelimiter("\n");
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print(" Ingrese un numero para saber si su numero es primo o no:\n ");
        int numero = leer.nextInt();
      
        solucion(numero);
    }

    public static void solucion(int numero) {
        int contador = 0;
        boolean bandera = true;

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                contador++;
            }

        }
      
        if (contador < 2 ) {
            System.out.println("Su numero es primo - " +  bandera);
        } else {
            bandera=false;
            System.out.println("Su numero no es primo - " + bandera);
        }
    }
}
    
