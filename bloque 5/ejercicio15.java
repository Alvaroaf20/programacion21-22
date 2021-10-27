public class ejercicio15 {
public static void main(String[] args) {


/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. */
int base;
int numeroExponente;

System.out.println("Introduce la base ");
base=Integer.parseInt(System.console().readLine());

System.out.println("Introduce el exponente");
numeroExponente=Integer.parseInt(System.console().readLine());

for (int i = 1; i <=numeroExponente; i++) {
int resultado=1;
int exponente=i;
for (int j = 1; j<=exponente; j++){
 resultado=resultado*base;
  }

 System.out.println(base+" elevado a "+i+" es: "+resultado); 
   
}
   
}
}
