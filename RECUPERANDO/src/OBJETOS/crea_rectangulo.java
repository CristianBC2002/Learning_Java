package OBJETOS;
import java.util.*;

//Creamos una clase:
//*Básicamente las clase representan sustantivos
//*Suelen estar compuestas de variables y métodos
//*Las clases serviran para crear objetos (instancias)
public class crea_rectangulo{
double base;
double altura;


//Creamos un constructor: 
//*Básicamente sirve para inicializar las variables de la clase "crea_rectangulo"
//*Se deben llamar igual que el nombre de la clase
crea_rectangulo(){
base = 1;
altura = 1;
}


//Creamos métodos (funciones): calcularArea(), calcularPerimetro()
//Sirven para agrupar partes de nuestro código que podremos llamar cuando nos haga falta
//Se debe utilizar (return Ejemplo) al final del método para que nos devuelva un resultado
//Si no queremos que nos devuelva nada, ponemos void o no simplemente no escribimos nada
double calcularArea(){
double area = base*altura;
System.out.println("El area es: " +area);
return area;
}

double calcularPerimetro(){
double perimetro= (2*base) + (2*altura);
System.out.println("El perimetro es: " +perimetro);
return perimetro;
   
        
}
}