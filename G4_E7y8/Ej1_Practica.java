/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01.G4_E7y8;

import java.util.Scanner;


public class Ej1_Practica {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int num1, num2, opc, resultado;
        double result;
        System.out.println("Ingresa dos numeros: ");
        num1 = read.nextInt();
        num2 = read.nextInt();

        System.out.println("Ingresa opcion del 1 al 4:\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir");

        opc = read.nextInt();

        switch (opc) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("La suma de tus numeros es: " + resultado);
                break;
            case 2:
                resultado = resta(num1, num2);
                System.out.println("La resta de tus numeros es: " + resultado);
                break;
            case 3:
                resultado = multi(num1, num2);
                System.out.println("La multiplicación de tus numeros es: " + resultado);
                break;
            case 4:
                result = division(num1, num2);
                System.out.println("La division de tus numeros es: " + result);
                break;
            default:
                System.out.println("Ingresa una opción correcta");
        }

    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}
