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

/*
EJ1 Guia Teorica
Implementar un programa que le pida dos números enteros al usuario y 
determine si ambos o alguno de ellos es mayor a 25.
*/

public class Ej_Practico {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu primer numero entero");
        int num1 = leer.nextInt(); leer.nextLine();
        int num2 = leer.nextInt(); leer.nextLine();
        
        int num3 = 25;
        
        if (num2 > num3 || num1 > num3) {
            System.out.println("Alguno de tus numeros o los dos son mayor a 25") ;
        }else { 
            System.out.println("Tus numeros son inferiores a 25");
        }
        
    }
   /*
Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”

*/
    
    class Switch {
            public Switch() {
               
                Scanner leer = new Scanner(System.in);
                
                
                                           
                System.out.println("Ingresa del 1 al 4 que tipo de motor es el tuyo");
                       int tipoMotor= leer.nextInt();
                
                
                switch(tipoMotor) {
                    
                    case 1:
                        System.out.println("La bomba es una bomba de agua");
                    break;
                    
                    case 2: 
                        System.out.println("La bomba es una bomba de gasolina");
                        break;
                        
                    case 3: 
                        System.out.println("La bomba es una bomba de Hormigón");
                        break;
                        
                    case 4: 
                        System.out.println("La bomba es una bomba de pasta alimenticia");
                        break;
                        
                    default:
                        System.out.println("La opcion ingresada no cumple las condiciones anteriores mencionadas"
                                + "por favor ingresar una opción correcta");
                       
                         
                }
                    
                    
            }
  
                
                
                
                
    }
     }



         