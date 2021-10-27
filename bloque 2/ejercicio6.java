public class ejercicio6 {
public static void main(String[] args) {




/*Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.*/

float precioInicio;
double iva ;
float precioTotal;
iva = 1.21;
System.out.println("Introduzca precio sin iva");
precioInicio= Integer.parseInt(System.console().readLine());
precioTotal=precioInicio*(float)iva;
System.out.println("el precio con iva es:"+precioTotal);

}
}
