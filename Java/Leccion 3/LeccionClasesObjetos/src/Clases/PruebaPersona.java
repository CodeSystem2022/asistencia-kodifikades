package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
      Persona persona1 = new Persona(); //Llamamos al contructor
      
      //Se le asignan los atributos al nuevo objeto
      persona1.nombre = "Juan Cruz"; //El valor hezadecimal normalmente comienza con 0x
      persona1.apellido = "Reche";
      persona1.obtenerInformacion();
      
      Persona persona2 = new Persona();
        System.out.println("pernona2 = " + persona2);
        System.out.println("pernona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Ferran";
        persona2.apellido = "Reche";
        persona2.obtenerInformacion();
    }
    
}

