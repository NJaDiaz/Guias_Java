/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
e indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package javaintro01.G4_E7y8;

import java.util.Scanner;


public class Ej2_Practica {
    
     static Scanner read = new Scanner(System.in).useDelimiter("\n");
    
     public static void main(String[] args) {
   
        System.out.println("Ingrese la cantidad de personas que desea ingresar");        
        int n = read.nextInt();
        
        edad(n);
        
    }
    
    
    public static void edad(int n) { 
        
        for (int i = 0; i < n; i++) {
            String opc;
            System.out.println("Ingrese el nombre de la persona: ");
            String name = read.next();
            
            System.out.println("Ingresa la edad de la persona:");
            int year = read.nextInt();
            
            if (year >= 18) {
                System.out.println("Esta persona es mayor de edad");
            }else{
                System.out.println("Esta persona es menor de edad");
            }
            
            System.out.println("¿Desea ingresar otra persona?(Ingrese no para salir)");
           opc = read.next();
            if (opc.equalsIgnoreCase("NO")) {
                break; 
            }
            
        }
    }
}
