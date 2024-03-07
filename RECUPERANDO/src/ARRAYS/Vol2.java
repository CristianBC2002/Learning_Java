/*
a. Escriba un método max que nos devuelva el máximo de los valores
incluidos en el vector.
*/

package ARRAYS;
import java.util.*;

public class Vol2 {
public static void main (String [] args){


    int notas [] = new int [5];
    
    //Al contrario que en el ejercicio de los valores MIN, esta variable no hace falta declararla después 
    //(NO SÉ POR QUÉ, INVESTIGAR DESPUÉS)
    
   //LA VARIABLE SE PODRÍA INICIALIZAR ASÍ (MAS RECOMANDABLE):
    //int max = notas [0];
    
    //O así:
    int max = 0;
        
    notas [0] = 4;
    notas [1] = 7;
    notas [2] = 8;
    notas [3] = 9;
    notas [4] = 2;
    
    for (int i = 0; i < notas.length; i++) {
        if (notas [i] > max){
            max = notas [i]; 
        }  
    }
    
    System.out.println(+max);
} 
}