public class ejercicio7 {
public static void main(String[] args) {


/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

int combinacion;

for(int i=0;i<=4;i++){
System.out.println("Introduzca la combinacion ");
combinacion=Integer.parseInt(System.console().readLine());
if(combinacion==1777){
System.out.println("La caja fuerte se ha abierto satisfactoriamente");
i=5;}
if(combinacion!=1777){
 System.out.println("Lo siento, esa no es la combinación"); }



   
}
   
}
}
