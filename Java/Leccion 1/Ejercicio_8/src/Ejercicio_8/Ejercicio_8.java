/*
 
 */
package Ejercicio_8;
import java.util.*;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo");
        double precio = entrada.nextDouble();
        double precioTotal = precio - (precio*0.20);
        if (precio >= 5100)
        {System.out.println("El precio del articulo es: " +precioTotal );}
        else
        {System.out.println("El precio del articulo es = " +precio );}
        
        
    }
    
}
