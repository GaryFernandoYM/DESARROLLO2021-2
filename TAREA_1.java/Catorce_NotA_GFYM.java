import java.util.Scanner;

public class Catorce_NotA_GFYM {

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int calificacion;
      System.out.print("Ingresa el valor de calificacion: ");
      calificacion = in.nextInt();
      in.nextLine();
      if(calificacion==10)
         System.out.println("A");
      if(calificacion==9)
         System.out.println("B");
      if(calificacion==8)
         System.out.println("C");
      if(calificacion==7)
         System.out.println("D");
      if(calificacion==6)
            System.out.println("D");
      if(calificacion<=5 && calificacion>0)
         System.out.println("F");
         in.close();
    }

}