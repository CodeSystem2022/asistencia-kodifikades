/*Ejercicio 6:
Guillermo tiene N dolares. Luis tiene la mitad de lo que tiene Guillermo. 
Juan tiene la mitad de lo que poseen Guillermo y Luis juntos*/
package Ejercicio_6;

import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cantidad de dolares de Guillermo");
        double dolaresGuillermo = entrada.nextDouble();
        double dolaresLuis = dolaresGuillermo/2;
        double dolaresJuan = (dolaresGuillermo + dolaresLuis)/2;
        System.out.println("Guillermo tiene: " +dolaresGuillermo+ " $");
        System.out.println("Luis tiene: " +dolaresLuis+ " &");
        System.out.println("Juan tiene: " +dolaresJuan+ " $");
        
        
    }
    
}
