/*Ejercicio 7:
En una concesionaria el salario base es de 1000 mas una comision de 150 por cada unidad vendida, 
mas el 5% del valor de la unidad. Realize un programa que calcule el salario de un empleado.
 */
package Ejercicio_7;

import java.util.*;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario = 1000;
        System.out.println("Ingrese la cantidad de unidades vendidas");
        int unidadesVendidas = entrada.nextInt();
        System.out.println("Ingrese el valor total de las unidades vendidas");
        double valorUnidades = entrada.nextDouble();
        double comision = valorUnidades * 0.05;
        double total = unidadesVendidas * 150 + salario + comision;
        System.out.println("El salario neto es: " +total+ " $");
    }
    
}
