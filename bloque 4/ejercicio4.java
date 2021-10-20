public class ejercicio4 {
public static void main(String[] args) {




/*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.*/

int horas;
int salario;
System.out.println("Introduzca las horas trabajadas");
horas= Integer.parseInt(System.console().readLine());
if (horas<=40){
salario=(horas*12);
System.out.println("el salario es de "+salario+"€");
}else{
  }if (horas>=41){
salario=(horas*16);
System.out.println("el salario es de "+salario+"€");

}

}
}
