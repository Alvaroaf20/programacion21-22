public class ejercicio4 {
public static void main(String[] args) {



/*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.*/
int euro;
int peseta ;
int pesetasTotal;
peseta = 166;
System.out.println("Introduzca cantidad de euros");
euro= Integer.parseInt(System.console().readLine());
pesetasTotal=euro*peseta;
System.out.println("La cantidad de euros introducida cooresponden a las siguientes pesetas:"+pesetasTotal);

}
}
