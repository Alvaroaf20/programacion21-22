public class ejercicio12 {
public static void main(String[] args) {


/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
introducir por teclado.*/

int primeraPosicion =-1;
int segundaPosicion =1;
int numeroIntroducido;  
int resultado1;



System.out.print("Introduzca el numero de secuencias ");
  numeroIntroducido = Integer.parseInt(System.console().readLine());
  
   
  for(int i=1;i<=numeroIntroducido;i++ ){
  resultado1=primeraPosicion;
   primeraPosicion=segundaPosicion;
   segundaPosicion=resultado1 + segundaPosicion;
  System.out.print(""+segundaPosicion+"");
  
  }
 
  
  
}
}
