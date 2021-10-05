import java.util.Scanner;
public class Suma{
   public static void main(String[]args) {
     Scanner in = new Scanner(System.in);
     String nombre = " ";
     int numero1 = 0, numero2 = 0,resultado = 0;
     System.out.println("¿cual es tu nombre?");
     nombre = in.nextLine();
     System.out.println("Ingrese el primer valor:");
     numero1 = in.nextInt();
     System.out.println("Ingrese el segundo valor:");
     numero2 = in.nextInt();
     resultado = numero1 + numero2;
     System.out.println("HOLA " + nombre + " EL RESULTADO ES:" + resultado   );
     in.close();
   } 
 }
