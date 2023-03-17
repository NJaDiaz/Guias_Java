/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01.E4_6;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Exercises_Extras {
    public static void ExtraExercise1(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas.
        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        */
        
        Scanner read = new Scanner(System.in);
            
        System.out.println("Ingresa los minutos para calcurar tu equivalente");
        
         int time = read.nextInt();
        int hours, days;
        
         hours = (time / 60);
         days = hours / 24;
         hours = hours % 24;
         
        System.out.println("Tu tiempo en dias y horas es el siguiente: " + days + " dias " + "y " + hours + " horas"  );
        
                
        
        
    }
    
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
        A continuación, realizar las instrucciones necesarias para que: 
        B tome el valor de C, 
        C tome el valor de A, 
        A tome el valor de D 
        y D tome el valor de B. 
        Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        
        int A = 13, B = 14, C = 15, D = 16; // declarar y asignar valores iniciales
        
        System.out.println("Valores iniciales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        int aux = B; // variable auxiliar para almacenar el valor de B
        
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
        
    }
    
    
    
    
    

