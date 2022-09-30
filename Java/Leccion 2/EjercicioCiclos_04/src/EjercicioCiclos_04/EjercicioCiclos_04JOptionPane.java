/*
Ejercicio 04
Pedir al usuario que teclee numero hasta introducir uno negativo, luego mostrar cuantos numero se ha introducido
(Realizar con clase Scanner y JOptionPane
 */
package EjercicioCiclos_04;
import javax.swing.JOptionPane;
public class EjercicioCiclos_04JOptionPane {

    public static void main(String[] args) {
        var contador = 0;

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while (num >= 0) {
            contador++;
            JOptionPane.showInternalMessageDialog(null, "Contador: " + contador);
            JOptionPane.showInternalMessageDialog(null, "El numero ingresado es positivo");;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        }

        JOptionPane.showInternalMessageDialog(null, "El ciclo finalizó");
        JOptionPane.showInternalMessageDialog(null, "Se han ingresado " + contador + " numeros");
    }

}
