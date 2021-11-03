public class ejercicio9 {
public static void main(String[] args) {


/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/

int numeroDigitos=1;
int n;
int numeroIntroducido;   
System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
   n=numeroIntroducido;
   
  while(n>10){
    //n entre 10 y ese valor se lo asigno a n//
    n /=10;
    numeroDigitos++;
  }
  System.out.print("el número tiene "+numeroDigitos+" dígitos");
  
  
}
}
