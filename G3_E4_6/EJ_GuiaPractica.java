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
 

public class EJ_GuiaPractica {
    
    public static void exercise8(String[] args) {
        
        int n = 4; // número de elementos por lado
for (int i = 1; i <= n; i++) { // ciclo para imprimir cada línea
    for (int j = 1; j <= n; j++) { // ciclo para imprimir cada carácter en la línea
        if (i == 1 || i == n || j == 1 || j == n) { // si es borde del cuadrado
            System.out.print("* ");
        } else { // si es espacio interior del cuadrado
            System.out.print("  ");
        }
    }
    System.out.println(); // imprimir salto de línea para pasar a la siguiente línea
}
    }
    
    
    public static void exercise7(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int correctas = 0, incorrectas = 0;
        
        // Leer cadenas enviadas por el usuario
        do {
            System.out.print("Introduce una cadena (&&&&& para finalizar): ");
            cadena = sc.nextLine();
            
            if (cadena.equals("&&&&&")) { // Secuencia FDE
                System.out.println("Fin del envío de cadenas");
            } else if (cadena.length() != 5 || cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O') {
                // Secuencia incorrecta
                System.out.println("Secuencia incorrecta");
                incorrectas++;
            } else { // Secuencia correcta
                System.out.println("Secuencia correcta");
                correctas++;
            }
        } while (!cadena.equals("&&&&&"));
        
        // Imprimir informe
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
   

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros:");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        String respuesta = "";
        
        do {
            System.out.println("MENU\n\n"
                + "1. Sumar.\n"
                + "2. Restar.\n"
                + "3. Multiplicar.\n"
                + "4. Dividir.\n"
                + "5. Salir.\n\n"
                + "Ingrese una opción:");
            int opcion = read.nextInt();
           
            switch (opcion) {
                case 1:
                    System.out.println("La suma es -> " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es -> " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es -> " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es -> " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = read.next();
                    break;
            }
        } while (! respuesta.equalsIgnoreCase("S"));
        
        
        
    }
    
    
    public static void Exercise5(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, 
        y a continuación solicite números al usuario hasta que la suma de los números
        introducidos supere el límite inicial.
        
        */
        
        System.out.println("Ingresa un numero como limite");
        
        Scanner read = new Scanner(System.in);
        int limit = read.nextInt();
        int suma = 0;
        
        do{
            System.out.println("Ingresa otro numero");
            int num = read.nextInt();
            
            if (num>= 0 ) {
                suma += num;
            }
        } while (suma <= limit);
        System.out.println("Has superado el limite, el total de los numeros"
        + " Ingresados es: " + suma);
      
    }
 
    
    public static void exercise4(String[] args) {
        /*
        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
        Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
        en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

        */
        
        System.out.println("Ingresa una frase");
            Scanner read = new Scanner(System.in);
    String frase = read.nextLine();
            String letra = frase.substring(0,1);
      
    
            if (letra.equals("a") || letra.equals("A")) {
                System.out.println("Correcto");
           
        }else{
                System.out.println("Incorrecto");
            }
            
        
    }
    
    
    public static void exercise3(String[] args) {
        /*
        Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
        Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
        en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
        */
                  Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresa una frase o palabra de 8 caracteres.");
              String frase = read.nextLine();
              
              if (frase.length() == 8) {
                  System.out.println("Correcto");
        }else{
                  System.out.println("Incorrecto");
              }
        
        
        
        
    }
    
        
    public static void exercise2(String[] args) {
        Scanner read = new Scanner(System.in);
        /*
        Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
        Nota: investigar la función equals() en Java.

        */
        System.out.println("Ingresa una frase");
        
        String frase = read.nextLine();
            
        if (frase.equals("eureka") || frase.equals("EUREKA") ) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        }
                
   
    public static void exercise1(String[] args) {
        //Crear un programa que dado un número determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        
        int num ; 
        
        System.out.println("Ingresa tu numero para saber si es par o impar");
        num = leer.nextInt();
        
        if (num%2 == 0) {
            System.out.println("El numero es par");
        } 
            else {
                    System.out.println("El numero es impar");
                    }
    }

}