/*
Ejercicio 6
Pedir un numero hasta que se teclee un cero, al final mostrar la suma de todos los numeros
ingresados
 */
package EjercicioCiclos_06;
import java.util.Scanner;
public class EjercicioCiclos_06Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        int num,suma=0;
        do {                
         System.out.println("Ingrese un numero");
         num = entrada.nextInt();  
         suma +=num;
            } while (num!=0);
        System.out.println("suma = " + suma);
    }
    
}
