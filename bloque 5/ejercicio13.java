public class ejercicio13 {
public static void main(String[] args) {


/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/




int positivo=0;
int negativo=0;
int numero;


for (int i = 0; i < 10; i++) {

System.out.println("Introduce un numero");
numero=Integer.parseInt(System.console().readLine());
if(numero>0){
  positivo++;}
  else{negativo++;}
}
  
   System.out.println("hay "+positivo+" numero/s positivos y "+negativo+" numero/s negativos"); 
}
}







