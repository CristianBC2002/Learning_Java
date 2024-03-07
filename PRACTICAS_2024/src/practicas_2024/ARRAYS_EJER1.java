/*
Dado un vector de números reales:
Escriba un método max que nos devuelva el máximo de los valores incluidos en el vector (tendrá 5 valores por ejemplo).
*/
package practicas_2024;
import java.util.*;

public class ARRAYS_EJER1 {
    public static void main (String [] args){
  
    //Esto sirve para crear un array.
    int [] valor = new int [5];
    int i;
   
    //Esto sirve para indicar la posicion  y valor que tendrá el array
    valor [0]= 10;
    valor [1]= 2;
    valor [2]= 5;
    valor [3]= 7;
    valor [4]= 4;
    
    //Esto sirve para inicializar la variable "valor" dentro de una nueva variable llamada maximo
    int maximo= valor[0];
  
    //Siempre usaremos un bucle for para iniciar los arrays.
    /*En este caso el bucle empezará por 1 y trminará en 5
    (valor.length sirver para decirnos la longitud del array que en este caso será 5)
    luego el valor se irá incrementando en 1 hasta llegar al final del bucle
    */
    for (i= 1; i < valor.length; i++){
        if (valor [i] > maximo){
            maximo = valor[i];
    }
    }
    
        System.out.println("El valor maximo es: " +maximo);
    
}
}

