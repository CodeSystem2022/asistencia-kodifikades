package CicloWhile;

//import java.util.*;

public class CicloWhile {

    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos
<<<<<<< HEAD
        // Ciclo while
=======
>>>>>>> python
        while (conteo <= 3) {
            System.out.println("conteo = " + conteo);
            conteo++; // Se aumenta en uno la variable
        }
        var contador = 0;
<<<<<<< HEAD

        // Ciclo Do/While
        do {
            System.out.println("Contador = " + contador);
            contador++; // Incremento
        } while (contador < 7);
        {
        }

        // Ciclo for
        for (var i = 0/* Variable */; i < 7 /* Condicion */; i++/* Incremento */) {
            if (i % 2 == 0) {
                System.out.println("Contando: " + i);
                break ; // Una vez cumplida la condicion se termina el ciclo
            }

        }
        inicio:
        for (var i = 0; i < 7; i++) {
            if (i % 2 != 0) {
                continue inicio; // Vamos a la siguiente iteracion
            }
            System.out.println("Contando: " + i);
        }

      

        }
<<<<<<< HEAD:Java/Leccion 2/Ciclo While/src/CicloWhile/EjercicioWhile01.java
    }

=======
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
>>>>>>> python
=======
    }
>>>>>>> java:Java/Leccion 2/CicloWhile/src/CIcloWhile/CicloWhile.java
