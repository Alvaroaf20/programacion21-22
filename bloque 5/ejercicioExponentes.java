public class ejercicioExponentes {
public static void main(String[] args) {


/*Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.*/
int base;
int exponente;

System.out.println("Introduce la base ");
base=Integer.parseInt(System.console().readLine());

System.out.println("Introduce el exponente");
exponente=Integer.parseInt(System.console().readLine());

for (int i = 1; i <=exponente; i++) {
int resultado=1;

for (int j = 1; j<=i; j++){
 resultado=resultado*base;
  }

 System.out.println(base+" elevado a "+i+" es: "+resultado); 
   base=base+1; 
}
   
}
}
