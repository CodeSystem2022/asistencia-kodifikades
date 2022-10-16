package Operaciones;
public class Aritmetica {
 //Atributos de la clase
    int a, b;
    
 //Metodo
    public void sumarNumeros(){
    int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){ //No modifica el valor de los atributos
        this.a = a; //El argumeto "a" se asigna al atributo this.a
        this.b = b;
        //return a + b;
        return this.sumarConRetorno(); //Se llama a un metodo desde otro metodo (Esto se debe hacer solo con metodos que esten dentro de una misma clase)
        
    }
    

}
