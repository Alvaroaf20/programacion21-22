public class ejercicio1 {
public static void main(String[] args) {
  
  /*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/



float x,y ;
x=144;
y=999;
System.out.println("el valor de x es " + x);
System.out.println("el valor de y es " + y);
float sum = x + y;
System.out.println("La suma de mis variables es " + sum);
float res = x - y;
System.out.println("La resta de mis variables es " + res);
float mult= x * y;
System.out.println("La multiplicacion de mis variables es " + mult);
float div = x / y;
System.out.println("La division de mis variables es " + div);
}
}
