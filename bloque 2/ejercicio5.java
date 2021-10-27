public class ejercicio5 {
public static void main(String[] args) {







/*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.*/

double euro;
float peseta ;
float pesetasTotal;
euro = 0.006;
System.out.println("Introduzca cantidad de pesetas");
peseta= Integer.parseInt(System.console().readLine());
pesetasTotal=(float)euro*peseta;
System.out.println("La cantidad de euros introducida cooresponden a las siguientes pesetas:"+pesetasTotal);

}
}
