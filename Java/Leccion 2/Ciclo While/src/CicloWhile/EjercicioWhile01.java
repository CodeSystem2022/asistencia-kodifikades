package CicloWhile;

//import java.util.*;

public class EjercicioWhile01 {

    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos
        while (conteo <= 3) {
            System.out.println("conteo = " + conteo);
            conteo++; // Se aumenta en uno la variable
        }
        var contador = 0;
        do {
            System.out.println("Contador = "+contador);
            contador ++;  
        }
        while (contador < 7); {}
     
        for (var i = 0/*Definimos la variable*/; i < 7 /*Establecemos una condicion */; i++/*Definimos el incremento */){
            System.out.println("Contando: "+i);
           }
    }
}
