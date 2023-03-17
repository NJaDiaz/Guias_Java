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
public class Ej11Teoria {

    public static void main(String[] args) {

        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en
punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el
carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se 
mantienen sin cambios.
         */
        Scanner read = new Scanner(System.in). useDelimiter("\n");

        System.out.println("Ingresa una frase o palabra.");

        caracter(read.next());

        
    }

    public static void caracter(String frase) {
String FraAux = "";
        for (int i = 0; i < frase.length(); i++) {

         

            switch (frase.substring(i, i + 1)) {
                case "a":
                case "A":
                    FraAux += "@";
                    break;
                case "e":
                case "E":
                    FraAux += "#";
                    break;
                case "i":
                case "I":
                    FraAux += "$";
                    break;
                case "o":
                case "O":
                    FraAux += "%";
                    break;
                case "u":
                case "U":
                    FraAux += "*";
                    break;
                default:
                    FraAux += frase.substring(i, i + 1);
            }
        }
       
 System.out.println("La palabra cambiada es: " + FraAux);
        
     
}
}


     
        
       
    


