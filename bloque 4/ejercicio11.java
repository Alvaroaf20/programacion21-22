public class ejercicio11 {
public static void main(String[] args) {




/*Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.*/

int hora;
int segundos;
int segundosPasados;
double segundosMedianoche;

System.out.println("introduzca la hora");
hora= Integer.parseInt(System.console().readLine());
System.out.println("introduzca los segundos");
segundos= Integer.parseInt(System.console().readLine());

segundosPasados=(hora*3600)+(segundos*60);
segundosMedianoche=(24*3600)-segundosPasados;


System.out.println("faltan " + segundosMedianoche + "   segundos para llegar a media noche");

}
}
