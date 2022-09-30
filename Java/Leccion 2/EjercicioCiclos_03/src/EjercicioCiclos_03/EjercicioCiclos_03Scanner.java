/*
Ejercicio 03
Escribir un programa que lea numero hasta que se introduzca un cero y luego determinar si el numero es par o impar
(Realizar en clase Scanner y JOptionPane)
*/
package EjercicioCiclos_03;
import java.util.Scanner;

public class EjercicioCiclos_03Scanner {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = entrada.nextInt();

        while(num != 0) {
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");
                System.out.println("Ingrese otro numero");
                num = entrada.nextInt();
            } else {
                System.out.println("El numero " + num + " es impar");
                num = entrada.nextInt();
            }
        }

        System.out.println("El ciclo finalizó");    
    }
    
}
