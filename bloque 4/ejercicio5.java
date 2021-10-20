public class ejercicio5 {
public static void main(String[] args) {




/*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).*/

int a;
int b;
int resultado;
System.out.println("el prgrama resuelve ecuaciones del tipo ax+b=0");
System.out.println("introduzca el valor de a");
a= Integer.parseInt(System.console().readLine());
System.out.println("introduzca el valor de b");
b= Integer.parseInt(System.console().readLine());
resultado=(-b)/a;
System.out.println("el resultado de la ecuacion es:"+resultado);
}
}
