public class ejercicio11 {
public static void main(String[] args) {


/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.*/




int numero;

System.out.print("Introduzca cuantos numeros se van a introducir: ");
numero=Integer.parseInt(System.console().readLine());

for (int i = numero; i < numero+5; i++) {

System.out.println(i+"|"+i*i+"|"+i*i*i+"|");
}
  
    
}
}
