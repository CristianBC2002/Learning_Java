/*
Ahora vamos a utilizar la clase crea_rectangulo que hemos creado en el ejercicio anterior.
*/
package OBJETOS;
import java.util.*;


//Para utilizar las clases y objetos, las debemos usar aparte, en el Programa Principal...
public class usa_rectangulo {
    public static void main (String []args){
    
    //Vamos  a crear objetos a partir de la clase (crea_rectangulo)
       crea_rectangulo r1 = new crea_rectangulo();
       crea_rectangulo rectan = new crea_rectangulo();
       
       
    //Ahora vamos a usar la clase (crea_rectangulo) en los objetos creados arriba
    double perim;
         
    //Asigna el valor x" a la variable de instancia base del objeto r1
    r1.altura = 2.5;
    r1.base = 4;
    System.out.println("Area rectangulo R1");
    //Usaremos la función calcularArea() en el objeto R1
    r1.calcularArea();
    
    rectan.altura = 3;
    rectan.base = 7;
    System.out.println("Area Rectangulo RECTAN");
    rectan.calcularArea();
   
    System.out.println("Perim rectangulo R1");
    r1.calcularPerimetro();
    
    System.out.println("Perim rectangulo RECTAN");
    rectan.calcularPerimetro();
    
    
   }
}
