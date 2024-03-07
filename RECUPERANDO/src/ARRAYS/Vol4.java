/*
b. Escriba un método min que nos devuelva el mínimo de los valores
incluidos en el vector.
 */
package ARRAYS;
import java.util.*;

public class Vol4 {
public static void main (String [] args){

    int notas [] = new int [5];
    
    notas [0] = 4;
    notas [1] = 7;
    notas [2] = 8;
    notas [3] = 9;
    notas [4] = 2;
    
    //Esta variable debo declararla después del array, porque sino, no funcionará. Además la variable se debe inicializar así:
    int min = notas [0];
    
    for (int i = 0; i < notas.length; i++) {
        if (notas [i] < min){
        min = notas [i];
        
        }
    }
    System.out.println(min);

}    
}
