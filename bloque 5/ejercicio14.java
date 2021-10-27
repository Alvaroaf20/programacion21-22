public class ejercicio14 {
public static void main(String[] args) {


/*Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.*/
int base;
int exponente;
int resultado=1;
System.out.println("Introduce la base ");
base=Integer.parseInt(System.console().readLine());

System.out.println("Introduce el exponente");
exponente=Integer.parseInt(System.console().readLine());

for (int i = 1; i <=exponente; i++) {

resultado=resultado*base;

}
   System.out.println("el resultado de la potencia es: "+resultado); 
}
}
