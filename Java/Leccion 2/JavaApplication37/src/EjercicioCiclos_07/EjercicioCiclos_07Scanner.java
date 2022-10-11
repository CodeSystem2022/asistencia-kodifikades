/*
Ejercicio 7
Pedir numero hasta que se introduzca uno negativo y luego calcular la media
 */
package EjercicioCiclos_07;

import java.util.Scanner;
public class EjercicioCiclos_07Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float promedio = 0;
        int conteo = 0, suma = 0;
        
        System.out.println("Ingrese un numero");
        int num = entrada.nextInt();
   
       while (num>=0){
           System.out.println("Ingrese un numero");
            num = entrada.nextInt();
            conteo++;
            suma += num;
          if (conteo == 0){
           System.out.println("Se ha ingresado un numero negativo");
       }
          else {
           promedio = suma / conteo; 
       
          }  
       }
      System.out.println("Promedio = " + promedio );
    }
}
