/* Realizar un programa que calcule el area de un rectangulo a partir de la base y la altura. */
package Ejercicio_3;

import java.util.*;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo");
        int altura = entrada.nextInt();
        System.out.println("Ingrese la base del rectangulo");
        int base = entrada.nextInt();
        int area = altura * base;
        int perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);
    }

}
