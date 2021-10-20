public class ejercicio8 {
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
if (resultado<5){
System.out.println("la media es insuficiente");
}else{
  }
  if ((resultado>=5)&&(resultado<6)){
System.out.println("la media es suficiente");
}
else{
  }if ((resultado>=6)&&(resultado<7)){
System.out.println("la media es bien");
}
else{
  }
  if ((resultado>=7)&&(resultado<=8)){
System.out.println("la media es notable");
}
else{
  }
  if ((resultado>=9)&&(resultado<=10)){
System.out.println("la media es sobresaliente");
}else{
  }

}
}
