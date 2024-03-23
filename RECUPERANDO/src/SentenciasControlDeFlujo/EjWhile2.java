/*
Programa NúmeroSecreto PARTE 1.

Crear un programa que nos vaya pidiendo números por pantalla del 1 al 100
hasta que adivinemos el número secreto que serán un valor que
asignamos previamente.El programa termina si adivinamos el número o si
pulsamos el 0 para salir.
*/

package SentenciasControlDeFlujo;
import java.util.*;

 class EjWhile2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int contador = 1;
        int nSecreto = 25;
              
      
        
        while (true){
            System.out.println("Dime un n del 1 al 100: ");
            n= sc.nextInt();
            
            if (n == 0){
                System.out.println("Saliste del programa");
                break;
            }
            
            else if (n<1 || n>100){
                System.out.println("Debes escribir un n entre 1 y 100, vuelve a intentarlo!!");
                System.out.println("Presiona un caracter pra continurar..");
                n = sc.nextInt();
                continue;
            }
            
            else if (n == nSecreto){
                System.out.println("Bien!! Mision cumplida!!");
                break;
            }
            else {
                System.out.println("Numero incorrecto!! prueba otra vez!");
            }
            
  
        }
    }
}