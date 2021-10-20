public class ejercicio9 {
public static void main(String[] args) {




/*Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).*/

int a;
int b;
int c;
double dentroRaiz;
double resultado1;
double resultado2;
System.out.println("introduzca la a");
a= Integer.parseInt(System.console().readLine());
System.out.println("introduzca la b");
b= Integer.parseInt(System.console().readLine());
System.out.println("introduzca la c");
c= Integer.parseInt(System.console().readLine());


dentroRaiz=b*b-(4*a*c);
if (dentroRaiz==0){
  resultado1=-b/(2*a);
System.out.println("el valor de la ecuacion es"+resultado1);
}
else{}
 if(dentroRaiz>0){
  dentroRaiz=Math.sqrt(dentroRaiz);
  resultado1=(-b+dentroRaiz)/(2*a);
  resultado2=(-b-dentroRaiz)/(2*a);
  System.out.println("el valor de la ecuacion es: "+resultado1+" y "+resultado2);
  }else{}
  if(dentroRaiz<0){  
   System.out.println("no se puede hacer la ecuacion"); 
   }else{}
  if(a==0){  
   System.out.println("no se puede hacer la ecuacion"); 
   }else{}
  
}
}
