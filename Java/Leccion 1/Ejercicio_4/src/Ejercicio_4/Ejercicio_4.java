/* Realizar un programa que indique el mayor de dos numero mediante el operador ternario */
package Ejercicio_4;

import java.util.*;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = entrada.nextInt();
        var resultado = (num1 > num2) ? num1 : num2;
        System.out.println("El numero mayor es: " + resultado);

    }

}
