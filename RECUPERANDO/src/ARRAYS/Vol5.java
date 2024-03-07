/*
c. Escriba un método media que nos devuelva la media de los valores
incluidos en el vector.
 */
package ARRAYS;
import java.util.*;

public class Vol5 {
    public static void main (String [] args){
        
       int notas [] = new int [5];
        
       notas [0] = 8;
       notas [1] = 3;
       notas [2] = 6;
       notas [3] = 1;
       notas [4] = 9;
       
       double media;
       
        for (int i = 0; i < notas.length; i++) {
        }
   
         media = (notas [0] + notas [1] + notas [2] + notas [3] + notas [4]) /5;
         System.out.println("La media de las notas es: " +media);
        
    }
}
