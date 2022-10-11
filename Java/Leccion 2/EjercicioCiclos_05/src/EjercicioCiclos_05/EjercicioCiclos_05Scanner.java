/*
Ejerciio 5
Realizar un ejercicio en el que el usuario tenga que adivinar un numero, el programa debe mostrar 
si el numero ingresado por el usuario es mayo o menor al numero misterioso. Al final del programa 
se debe mostrar el numero de intentos.
 */
package EjercicioCiclos_05;

import java.util.Scanner;

public class EjercicioCiclos_05Scanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int conteo = 0, numIngresado;
        int num = (int) (Math.random() * 100);

        do {
            System.out.println("Ingrese un numero");
            numIngresado = entrada.nextInt();
            conteo++;
            if (num < numIngresado) {
                System.out.println("El numero ingresado es mayor al numero misterioso");
                System.out.println("Ingrese un numero");
                numIngresado = entrada.nextInt();
                conteo++;
            } else if (num > numIngresado) {
                System.out.println("El numero ingresado es menor al numero misterioso");
                System.out.println("Ingrese un numero");
                numIngresado = entrada.nextInt();
                conteo++;
            } else {
                System.out.println("Felicidades!!! Has adivinado el numero");
                conteo++;
            }
        } while (num != numIngresado);
        {

            System.out.println("Usted adivino el numero en " + conteo + " Intentos");
        }

    }

}
