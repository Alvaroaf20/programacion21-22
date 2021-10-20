public class ejercicio7 {
public static void main(String[] args) {




/*Realiza un programa que calcule la media de tres notas.*/

int media1;
int media2;
int media3;
float resultado;
System.out.println("introduzca la 1º nota");
media1= Integer.parseInt(System.console().readLine());
System.out.println("introduzca la 2º nota");
media2= Integer.parseInt(System.console().readLine());
System.out.println("introduzca la 3º nota");
media3= Integer.parseInt(System.console().readLine());
resultado=((float)media1+media2+media3)/3;
System.out.println("la media es:"+resultado);
}
}
