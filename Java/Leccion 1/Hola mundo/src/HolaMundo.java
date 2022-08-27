
import java.util.*;

public class HolaMundo {

    public static void main(String[] args) {
        String edadTexto;
/*
        System.out.println("Hola mundo desde java");

        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo string
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);

//Var-Inferencia de tipos en Java
        var miVariableEntera = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
//"soutv"´+ tab 
// SHIFT + f6 para ejecutar el codigo

//Reglas para definir una variable en java
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
//Caracteres especiales
        var nombre = "Juan";
        System.out.println("Nueva linea: \n" + nombre + "\n");//"Salto de linea": Diagonal inversa y letra "n"
        System.out.println("Tabulador: \t" + nombre);//"Tabulacion": Diagonal inversa y letra "t"
        System.out.println("MENU: \t\t");
        System.out.println("Retroceso: \b" + nombre);//"Retroceso": Diagonal inversa y letra "b"
        System.out.println("Comillas simples \'" + nombre + "\'");//Comillas simples
        System.out.println("Comillas dobles: \"" + nombre + "\"");//Comillas dobles

//Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);

        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);

        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo del float: " + Float.MAX_VALUE);

        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo del double: " + Double.MAX_VALUE);

        var numEntero = 20;//Las literales sin punto son automaticamente enteros
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;//Las literales con punto son automaticamente de tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);

        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        char varCaracter = '\u0024';//Indicamos la asignacion del codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterSimbolo = 36;//Indicamos el valor decimal del dodigo unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        //Tipos primitivos tipos booleanos
        boolean varBoole = false;
        System.out.println("varBool = " + varBoole);
        if (varBoole) {
            System.out.println("La bandera es verde");
        } else {
            System.out.println("Labandera es roja");
        }

        //Algoritmo ¿es mayor de edad?
        var edad = 17;
        //var adulto = edad >= 18;//Expresion booleana

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }

        //Conversiones de tipos primitivos
        var edad = ("20");
        System.out.println("edad = " + (edad + 1));
        var valorPi = Double.parseDouble("3,1416");
        System.out.println("valorPi = " + valorPi);

        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("entrada = " + entrada);
        //Conversion de tipos primitivos parte 2
        String var = edadTexto = String.valueOf(10);
        var nombre = "A";
        System.out.println(nombre);
        nombre = "b";
        System.out.println(nombre);
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma = " + solucion);
        solucion = num1 - num2;
        System.out.println("Solucion de la resta = " + solucion);
        solucion = num1 * num2;
        System.out.println("Solucion de la mutiplicacion = " + solucion);
        solucion = num1 / num2;
        System.out.println("Solucion de la division = " + solucion);

        var solucion2 = 3.4D / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);

        solucion = num1 % num2;//Guarda el residuo entero de la division
        System.out.println("solucion = " + solucion);

        if (num2 % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es impar");
            int varNum1 = 21, varNum2 = 4;
            int varNum3 = varNum1 + 6 - varNum2;//Una operacion
            System.out.println("varNum3 = " + varNum3);

            //Suma
            varNum1 += 1; //varNum1 = varNum1 + 1
            System.out.println("Suma = " + varNum1);

            //Resta
            varNum1 += 1;
            System.out.println("Resta = " + varNum1);

            //Multiplicacion 
            varNum1 *= 2;
            System.out.println("Multiplicacion = " + varNum1);

            //Division 
            varNum1 /= 4;
            System.out.println("Division = " + varNum1);

            //Resto
            varNum1 %= 4;
            System.out.println("Resto = " + varNum1);

            //Operadore unarios: Cambio de signo
            var varA = 7;
            var varB = -varA;
            System.out.println("varA = " + varA);
            System.out.println("varB = " + varB);

            //Operaddor de negacion
            var varC = true;//Esta literal por default en Java es de tipo boolean
            var varD = !varC;//Aqui esta invirtiendo el valor
            System.out.println("varC = " + varC);
            System.out.println("varD = " + varD);

            //Operadores unarios de incremento: Preincremento
            var varE = 9;//Se va a modificar su valor
            var varF = ++varE;//Simbolo antes de la variable
            System.out.println("varE = " + varE);
            System.out.println("varF = " + varF);
            //Postincremento (el simbolo va despues de la variable)
            var varG = 3;
            var varH = varG++; //Primero el valor de la variable, luego el incremento
            System.out.println("varG = " + varG);
            System.out.println("varH = " + varH);

            //Operadores unario de decremento
            var varI = 4;
            var varJ = --varI;
            System.out.println("varI = " + varI);
            System.out.println("varJ = " + varJ);

            //Posdecremento
            var varK = 8;
            var varL = varK--;
            System.out.println("varK = " + varK);
            System.out.println("varL = " + varL);

            //Operadores de igualdad y relacionales
            var aNum = 5;
            var bNum = 4;
            var cNum = (aNum == bNum);
            System.out.println("cNum = " + cNum);

            var dNum = aNum != bNum;
            System.out.println("dNum = " + dNum);

            var cadenaA = "Hello";
            var cadenaB = "Helli";
            var cVar = cadenaA == cadenaB;
            System.out.println("cVar = " + cVar);

            var fVar = cadenaA.equals(cadenaB);
            System.out.println("fVar = " + fVar);

            //Operadores relacionales
            var qVar = (aNum <= bNum);// > < <= >= == !=
            System.out.println("qVar = " + qVar);

            if (aNum % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }

            var edad = 30;
            var adulto = 18;

            if (edad >= adulto) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }

            //Operadores condicionales
            var valorA = 0;
            var valorMinimo = 0;
            var valorMaximo = 10;
            var respuesta = valorA >= 0 && valorA <= 10;

            if (respuesta) {
                System.out.println("Esta dentro del rango establecido");
            } else {
                System.out.println("Esta fuera del rango establecido");
            }
            var vacaciones = false;
            var diaLibre = false;

            if (vacaciones || diaLibre) {
                System.out.println("Papá puede asistir al juego de su hijo");
            } else {
                System.out.println("No puede asistir");
            }

            //Operador Ternario
            var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
            System.out.println("resultadoT = " + resultadoT);

            var numeroT = 4;
            resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
            System.out.println("resultadoT = " + resultadoT);

            //Prioridad de los operadores
            var x = 5;
            var y = 10;
            var z = ++x + y--;
            System.out.println("x = " + x);
            System.out.println("z = " + z);
            System.out.println("y = " + y);

            var solucionAridmetica = 4 + 5 * 6 / 3;
            System.out.println("solucionAridmetica = " + solucionAridmetica);

            solucionAridmetica = (4 + 5) * 6 / 3;
            System.out.println("solucionAridmetica = " + solucionAridmetica);*/

        }

    }
