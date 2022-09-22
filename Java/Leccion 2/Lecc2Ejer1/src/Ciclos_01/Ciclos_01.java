/*Ejercicio 1:
 Leer un numero y calcular su cuadrado, repetir el proceso hasta que se introduzca 
 un numero negativo
 */
package Ciclos_01;

import java.util.Scanner;

public class Ciclos_01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cuadrado;
        System.out.println("Digite un numero");
        num = entrada.nextInt();
        while (num >= 0) {
            cuadrado = num * num;
            System.out.println("El numero (" + num + ") elevado al cuadrado es: " + cuadrado);
            System.out.println("Digite otro numero");
            num = entrada.nextInt();
        }
        System.out.println("El prgrama ha finalizado por numero negativo");
    }

}
