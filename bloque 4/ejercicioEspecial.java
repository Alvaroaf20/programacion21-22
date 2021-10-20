public class ejercicioEspecial {
public static void main(String[] args) {




/*Realiza un programa que convierta a 5 divisas una cantidad dada: euro,dolar,libra,yen,yuan.*/

int moneda;
double cantidad;
double euro,dolar,libra,yen,yuan;
final double FACTOR_CANTIDAD_DOLAR=1.16;
final double FACTOR_CANTIDAD_LIBRA=0.84;
final double FACTOR_CANTIDAD_YEN=133.06;
final double FACTOR_CANTIDAD_YUAN=7.43;




System.out.println("Introduzca el tipo de moneda(eligiendo el numero del tipo de la moneda): 1)euro 2)dolar 3)libra 4)yen 5)yuan");
  moneda = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca la cantidad de esa moneda");
  cantidad = Double.parseDouble(System.console().readLine());
    switch(moneda) {
      case 1:
        cantidad /=1;
        break;
  
  case 2:
       cantidad /=FACTOR_CANTIDAD_DOLAR;
        break;
  
  case 3:
        cantidad /=FACTOR_CANTIDAD_LIBRA;
        break;
  
  case 4:
        cantidad /=FACTOR_CANTIDAD_YEN;
        break;
        
        case 5:
        cantidad /=FACTOR_CANTIDAD_YUAN;
        break;
        
        default:
        
        
     }
     
     
     
     euro=cantidad;
     dolar=cantidad*FACTOR_CANTIDAD_DOLAR;
     libra=cantidad*FACTOR_CANTIDAD_LIBRA;
     yen=cantidad*FACTOR_CANTIDAD_YEN;
     yuan=cantidad*FACTOR_CANTIDAD_YUAN;
     
     
     System.out.println("la conversion a euros es de:"+ euro );   
        System.out.println("la conversion a dolar es de:"+ dolar);
        System.out.println("la conversion a libra es de:"+ libra );
        System.out.println("la conversion a yen es de:"+ yen);
        System.out.println("la conversion a yuan es de:"+ yuan);
        
}
}
