/*
Ejercicio 04
Pedir al usuario que teclee numero hasta introducir uno negativo, luego mostrar cuantos numero se ha introducido
(Realizar con clase Scanner y JOptionPane
 */
package EjercicioCiclos_04;
import java.util.Scanner;
public class EjercicioCiclos_04Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var contador = 0;
        System.out.println("Ingrese un numero ");
        int num = entrada.nextInt();
        while (num >= 0){
            contador ++;
            System.out.println("contador = " + contador);
            System.out.println("El numero " + num+ " es positivo");
            num = entrada.nextInt();
            System.out.println("Ingrese otro numero");

        }

        System.out.println("El ciclo finalizo");
        System.out.println("Usted ha ingresado " + contador+ " numeros");


    }
}
