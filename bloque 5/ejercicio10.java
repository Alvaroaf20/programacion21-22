public class ejercicio10 {
public static void main(String[] args) {


/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado.*/
float resultado;
int media;
float numero=0;
float contador=0;
System.out.print("Introduzca cuantos numeros se van a introducir: ");
media=Integer.parseInt(System.console().readLine());

for (int i = 0; i < media; i++) {
System.out.print("Introduzca el numero con el que desea hacer la media ");
numero=Float.parseFloat(System.console().readLine());
contador=contador+numero;
}
resultado=contador/media;    
  System.out.print(" la media es: "+ resultado);  
    
}
}
