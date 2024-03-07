/*
Crear array que se llama lluvias con 6 valores.
Crearermos una variable (i) prara recorrer el arrray con un bucle for.
Una variale (total) para almacenar las lluvias.
 */


package practicas_2024;
import java.util.*;

public class arays_ejemplos {
    public static void main (String [] args){
int [] lluvias = new int [6];
int i;
int total=0;

lluvias [0]=10;
lluvias [1]=2;
lluvias [2]=30;
lluvias [3]=4;
lluvias [4]=50;
lluvias [5]=6;

for (i=0; i<=5;i++){
total = total +  lluvias[i];
    System.out.println("El total de lluvias es: " +total);
}
    
   
}
}
