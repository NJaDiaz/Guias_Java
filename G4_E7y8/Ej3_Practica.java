/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package javaintro01.G4_E7y8;

import java.util.Scanner;

public class Ej3_Practica {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        double euro;
        
        System.out.println("Ingresa la cantidad de euros que desee cambiar");
        euro = read.nextDouble();
        System.out.println("Ingrese a que divisa quiere cambiar\n"
                + "1. Libra\n"
                + "2. Dolar\n"
                + "3. Yen");
            int opc = read.nextInt();
        
        
        switch (opc) {
            case 1:
                System.out.println("El cambio de sus euros a Libra es de: " + clibra(euro));
                 break;
                  case 2:
                System.out.println("El cambio de sus euros a Libra es de: " + cdolar(euro));
                 break;
                  case 3:
                System.out.println("El cambio de sus euros a Yen es de: " + cyen(euro));
                 break;
            default:
                System.out.println("Ingresa una de las opciones recien dadas.");
        }
        
        
        
        
    }

    public static double cyen(double euro) {

        return euro * (129.852);
    }

    public static double cdolar(double euro) {
        return euro * (1.28611);
    }

    public static double clibra(double euro) {
        return euro * (0.86);
    }
}
