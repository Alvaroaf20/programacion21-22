public class ejercicio17 {
public static void main(String[] args) {


/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/


int numeroIntroducido;  

int resultado=0;

System.out.print("Introduzca un numero entero y positivo ");
  numeroIntroducido = Integer.parseInt(System.console().readLine());
  

  if(numeroIntroducido < 0){
   System.out.print("la secuencia no se puede realizar ya que el número que se ha introducido es negativo");
    }
  

   else{
     System.out.println("la secuencia  se puede realizar ya que el número que se ha introducido no es negativo");
    
     for(int i = numeroIntroducido;i<numeroIntroducido +100;i++){
      resultado+=i; 
      
      
       }
       System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es "+resultado);
     }
  
  
}
}
