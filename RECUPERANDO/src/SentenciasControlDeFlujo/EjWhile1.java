/*
 Vamos a crear un programa que nos pida números hasta que tecleemos 0.
 */
package SentenciasControlDeFlujo;
import java.util.*;

public class EjWhile1 {
    public static void main  (String [] args){
        Scanner sc = new Scanner (System.in);
        int n;
        n=0;
        
        System.out.println("Dime un número que no sea 0: ");
        n= sc.nextInt();

        
        while (n != 0){
        System.out.println("Incorrecto!! Dime un número que no sea 0: ");
        n= sc.nextInt();
        
        //Si queremos que el while no se ejecute en bucle (solo una vez), ponemos break al final de la sentencia:
        //break;
        //
        
        }
           
    }
}
