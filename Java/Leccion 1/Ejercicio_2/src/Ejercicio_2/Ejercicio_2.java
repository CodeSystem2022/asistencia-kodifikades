<<<<<<< HEAD
/* Realize un programa que calcule el salario de un empleado a partir de las horas
=======
/* Realizar un programa que calcule el salario de un empleado a partir de las horas
>>>>>>> python
trabajadas y la paga por horas. */
package Ejercicio_2;

import java.util.Scanner;


public class Ejercicio_2 {
public static void main(String[] args) {

 Scanner entrada = new Scanner(System.in);
 double pagaPorHora,salario;
 int horasTrabajadas;
    System.out.println("Ingrese la cantidad de horas trabajadas en la semana");
    horasTrabajadas = Integer.parseInt(entrada.nextLine());
    System.out.println("Ingrese la paga por horas");
    pagaPorHora = entrada.nextDouble();
    salario = pagaPorHora * horasTrabajadas;
    System.out.println("El salario es: " +salario+" USD" );
    
    }
    
}
