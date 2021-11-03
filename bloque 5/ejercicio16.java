public class ejercicio16 {
public static void main(String[] args) {


/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/


int numeroIntroducido;  

boolean primo=true;


System.out.print("Introduzca el numero de que quiera saber si es primo ");
  numeroIntroducido = Integer.parseInt(System.console().readLine());
  
for(int i=2;i<numeroIntroducido;i++){
  if((numeroIntroducido % i)==0){
    primo=false;
    }
  }
 if(primo){
   System.out.print("el numero es primo");
   }
   else{
     System.out.print("el numero no es primo");
     }
  
  
}
}
