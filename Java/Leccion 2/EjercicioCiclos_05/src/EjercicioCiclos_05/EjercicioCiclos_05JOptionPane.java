/*
Ejerciio 5
Realizar un ejercicio en el que el usuario tenga que adivinar un numero, el programa debe mostrar 
si el numero ingresado por el usuario es mayo o menor al numero misterioso. Al final del programa 
se debe mostrar el numero de intentos. (Realizar con JOptionPane y Scanner)
 */
package EjercicioCiclos_05;

import javax.swing.JOptionPane;

public class EjercicioCiclos_05JOptionPane {

    public static void main(String[] args) {

        int aleatorio, num, contador = 0;
        aleatorio = (int) (Math.random() * 100);

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 100 "));
            contador++;
            if (num > aleatorio) {
                JOptionPane.showMessageDialog(null, "El numero que usted ingreso es mayor al numero misterioso");
                contador++;
            } else if (num < aleatorio) {
                JOptionPane.showMessageDialog(null, "El numero que usted ingreso es menor al numero misterioso");
                contador++;
            } else {
                JOptionPane.showMessageDialog(null, "Felicidades!!!! Usted ha adivinado el numero ");
                contador++;
            }
        } while (num != aleatorio);
        JOptionPane.showMessageDialog(null, "Usted adivino el numero en " + contador + " Intentos");
    }
}
