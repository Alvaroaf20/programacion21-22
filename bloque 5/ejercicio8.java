public class ejercicio8 {
public static void main(String[] args) {


/*Muestra la tabla de multiplicar de un número introducido por teclado.*/
int numero;
int multiplo=0;
int resultado;
System.out.print("Introduzca el numero el cual quiera saber su tabla de multiplicar = ");
numero=Integer.parseInt(System.console().readLine());
for(int i=0;i<=10;i++){
resultado=numero*multiplo;
System.out.println(numero+" * "+multiplo+" = "+resultado);
multiplo++;

   
}
   
}
}
