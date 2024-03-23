//Usando CharAT

//PROGRAMA QUE NOS DIGA LA POSICION DE UN CARACTER EN UNA CADENA DE TEXTO

package STRINGS;
import java.util.*;

public class Vol1 {
    public static void main (String [] args){
        
      
        String cadena = "ESCRIBIENDO CODIGO";
        char letra = cadena.charAt(2);
        System.out.println("El caracter en la posicion 2 es: "+letra); 
    //EN ESTE CASO, NOS MOSTRARÁ LA LETRA "S".
    //ESTO SE DEBE A QUE, AL IGUAL QUE EN LOS ARRAYS, EL PROGRAMA EMPIEZA A CONTAR DESDE 0.
        
    
    
    
    
    
    //USANDO Concat    
    
    String Cadena1 = "Buenos dias!!";
    String Cadena2= "Que puedo hacer para fastidiarte el día?";
    
        System.out.println("");
        System.out.println("El resultado de unir Cadena1 y Cadena2 es: ");
        System.out.println(Cadena1.concat(Cadena2));
        
        //También lo podemos pasar en los parametros como cadenas de textos
        //System.out.println(Cadena1.concat(" es un saludo"));

    }
}
