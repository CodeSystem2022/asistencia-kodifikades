/*Ejercicio 2:
 Leer un numero e indicar si es positivo o negativo, el programa
se repetira hasta que se introduzca un 0
 */
package Ciclos_02;

import javax.swing.JOptionPane;

public class Ejercicio_02 {

    public static void main(String[] args) {

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (num != 0) {

            if (num > 0) {
                System.out.println("El numero " + num + " es positivo");

                num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

            } else {
                System.out.println("El numero " + num + " es negativo");
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
            }
        }
        System.out.println("El ciclo finalizó");

    }

}
