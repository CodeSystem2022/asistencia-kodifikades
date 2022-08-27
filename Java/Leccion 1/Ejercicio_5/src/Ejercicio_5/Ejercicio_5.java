/*Ejercicio 5:
Hacer un programa que calcule la suma de tres calificaciones*/
package Ejercicio_5;

import java.util.*;
public class Ejercicio_5 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese la primer calificacion");
        double calA = entrada.nextDouble();
        System.out.println("Ingrese la segunda calificacion");
        double calB = entrada.nextDouble();
        System.out.println("Ingrese la tercer calificacion");
        double calC = entrada.nextDouble();
        double sumaCal = calA + calB + calC;
        System.out.println("La suma de las calificaciones es: " + sumaCal);
        
    }
    
}
