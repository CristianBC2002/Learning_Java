/*
Programa NúmeroSecreto PARTE 1.

-Crear un programa que nos vaya pidiendo números por pantalla del 1 al 100
hasta que adivinemos el número secreto que serán un valor que
asignamos previamente.El programa termina si adivinamos el número o si
pulsamos el 0 para salir.
*/

package SentenciasControlDeFlujo;
import java.util.*;

 class EjWhile3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nº del 1 al 100: ");
        int n = 0;
        int contador = 1;
        int nSecreto = 25;
        
        n= sc.nextInt();
       
        while (n!=0 && n!=25){
            System.out.println("Intentto " +contador++);
            System.out.println("Numero incorrecto!! Dime otro: ");
            n = sc.nextInt();
            
            if (nSecreto<1 && nSecreto<=100){
                System.out.println("Limite de intentos alcanzado: ");
                
                break;
            }
            
  
        }
    }
}


//ESTA ES LA VERSIN COMPLEJA DEL EJERCICIO 3, LA BAMOS A DEJAR PARA MAS TARDE PARA VER SI YA SABES COMO SE HACE PARA DESPUÉS