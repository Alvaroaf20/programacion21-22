public class ejercicio14 {
public static void main(String[] args) {




/*Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.*/

int numero;
System.out.println("introduzca un numero");
numero= Integer.parseInt(System.console().readLine());

if((numero % 2)==0){
  System.out.println("el numero es par");}
  else{System.out.println("el numero es impar");}
  
  if((numero % 5)==0){
  System.out.println("el numero es divisible entre 5");}
  else{System.out.println("el numero no es divisible entre 5");}
}
}
