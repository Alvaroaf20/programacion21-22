public class ejercicio12 {
public static void main(String[] args) {




/*Escribe un programa que ordene tres números enteros introducidos por teclado.*/

int numero1;
int numero2;
int numero3;
int posicion1;
int posicion2;
int posicion3;
System.out.println("di el primer numero");
numero1= Integer.parseInt(System.console().readLine());
System.out.println("di el segundo numero");
numero2= Integer.parseInt(System.console().readLine());
System.out.println("di el tercer numero");
numero3= Integer.parseInt(System.console().readLine());

if(numero1>numero2&&numero1>numero3){
  posicion1=numero1;
}else{}
if(numero1>numero2&&numero1<numero3){
  posicion2=numero1;
}else{}
if(numero1<numero2&&numero1>numero3){
  posicion2=numero1;
  }else{}
if(numero1<numero2&&numero1<numero3){
  posicion3=numero1;
}else{}


if(numero2>numero1&&numero2>numero3){
  posicion1=numero2;
}else{}
if(numero2>numero1&&numero2<numero3){
  posicion2=numero2;
}else{}
if(numero2<numero1&&numero2>numero3){
  posicion2=numero2;
  }else{}
if(numero2<numero1&&numero2<numero3){
  posicion3=numero2;
}else{}


if(numero3>numero1&&numero3>numero2){
  posicion1=numero3;
}else{}
if(numero3>numero1&&numero2<numero2){
  posicion2=numero3;
}else{}
if(numero3<numero1&&numero2>numero2){
  posicion2=numero3;
  }else{}
if(numero3<numero1&&numero2<numero2){
  posicion3=numero3;
}else{}

System.out.println("el orden es: "+posicion1+">"+posicion2+">"+posicion3+".");
}
}
