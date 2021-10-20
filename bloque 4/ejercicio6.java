public class ejercicio6 {
public static void main(String[] args) {




/*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h.*/

double h;
double tiempo;
;
System.out.println("introduzca la altura a la que esta el objeto");
h= Integer.parseInt(System.console().readLine());
tiempo=Math.sqrt((2*h)/9.81);
System.out.println("tardara en caer "+tiempo+"segs");
}
}
