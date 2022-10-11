/*
Ejercicio 6
Pedir un numero hasta que se teclee un cero, al final mostrar la suma de todos los numeros
ingresados
 */
package EjercicioCiclos_06;
import javax.swing.JOptionPane;
public class EjercicioCiclos_06JOptionPane {
    public static void main(String[] args) {
     int num, suma=0;
        do {
          num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
          suma += num;
        } while (num!=0);
        JOptionPane.showInternalMessageDialog(null,"Suma= " +suma);
    }
    
}
