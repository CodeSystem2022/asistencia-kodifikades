/*
Ejercicio 03
Escribir un programa que lea numero hasta que se introduzca un cero y luego determinar si el numero es par o impar
(Realizar en clase Scanner y JOptionPane)
*/
package EjercicioCiclos_03;
import javax.swing.JOptionPane;

public class EjercicioCiclos_03JOptionPane {
    
    public static void main(String[] args) 
    {
        
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while(num != 0) {
            if (num % 2 == 0) {
               JOptionPane.showMessageDialog(null, "EL numero "+num+ " es par");
               num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            } else {
                JOptionPane.showMessageDialog(null, "EL numero "+num+ " es inpar");
               num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                
            }
        }

        System.out.println("El ciclo finalizó");    
        
    }
}
