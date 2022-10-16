
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
    Aritmetica aritmetica1 = new Aritmetica();  // Se llama al constructor, es decir, se reserva un espacio en la memoria
    aritmetica1.a = 3;
    aritmetica1.b = 7;
    aritmetica1.sumarNumeros();
    
    int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
    
    resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: "+resultado);
        
    
    }
    
   
}
