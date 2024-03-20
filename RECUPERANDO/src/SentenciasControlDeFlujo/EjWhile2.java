/*
Programa NúmeroSecreto.
Crear un programa que nos vaya pidiendo números por pantalla del 1 al 100
hasta que adivinemos el número secreto que serán un valor que
asignamos previamente.El programa termina si adivinamos el número o si
pulsamos el 0 para salir.
 */
package SentenciasControlDeFlujo;

import java.util.*;

public class EjWhile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nº del 1 al 100: ");
        int n = 0;
        int contador = 1;
        n = sc.nextInt();

        while (n != 0 && n != 25) {
            System.out.println("Intento " + contador++);
            System.out.println("Numero incorrecto, introduce otro nº: ");
            n = sc.nextInt();

            if (n == 0) {
                System.out.println("¡Gracias por jugar! Hasta luego.");
            } else if (n == 25) {
                System.out.println("BIEN");
            }
        }

    }
}

// TERMINAR EL PROGRAMA XD
// FALTA HACER QUE LLEVE LA CUENTA HASTA 100
