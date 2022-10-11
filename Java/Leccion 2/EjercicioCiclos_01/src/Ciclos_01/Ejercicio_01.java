/*Ejercicio 1:
 Leer un numero y calcular su cuadrado, repetir el proceso hasta que se introduzca 
 un numero negativo
 */
package Ciclos_01;

import javax.swing.JOptionPane;




public class Ejercicio_01 {
    public static void main(String[] args) {
      int num, cuadrado;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (num >= 0) {
            cuadrado = num * num;
            System.out.println("El numero (" + num + ") elevado al cuadrado es: " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        System.out.println("El prgrama ha finalizado por numero negativo");   
    }
    
}
