public class ejercicio15 {
public static void main(String[] args) {




/*Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.*/

int posicion;

System.out.println("Introduzca con que simbolo se llenara la pirámide");
String r = System.console().readLine();
System.out.println("Elija la posicion de la pirámide");
  System.out.println("1. Con el vértice hacia arriba");
  System.out.println("2. Con el vértice hacia abajo");
  System.out.println("3. Con el vértice hacia la izquierda");
  System.out.println("4. Con el vértice hacia la derecha");
  posicion = Integer.parseInt(System.console().readLine());
  
  switch(posicion) {
      case 1:
        System.out.println("  " + r);
        System.out.println(" " + r + r + r);
        System.out.println(r + r + r + r + r);
        break;
  
  case 2:
        System.out.println(r + r + r + r + r);
        System.out.println(" " + r + r + r);
        System.out.println("  " + r);
        break;
  
  case 3:
        System.out.println("    " + r);
        System.out.println("  " + r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println("  " + r + " " + r);
        System.out.println("    " + r);
        break;
  
  case 4:
        System.out.println(r);
        System.out.println(r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println(r + " " + r);
        System.out.println(r);
        break;
      default:
    }
  
  
  
}
}
