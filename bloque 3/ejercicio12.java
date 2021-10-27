public class ejercicio12 {
public static void main(String[] args) {




/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/

float nota1;
float mediaDeseada ;
float nota2;

System.out.println("Introduzca la nota del primer examen");
nota1= Integer.parseInt(System.console().readLine());
System.out.println("Introduzca la media deseada");
mediaDeseada= Integer.parseInt(System.console().readLine());
nota2=((mediaDeseada-(nota1*0.4f))*0.6f);

System.out.println("La nota que debes sacar en el segundo examen para obtener la media deseada es:"+nota2);

}
}
