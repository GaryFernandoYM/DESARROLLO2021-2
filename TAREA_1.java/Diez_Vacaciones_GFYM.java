import java.util.Scanner;

public class Diez_Vacaciones_GFYM {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double costo_por_km, presupuesto;
      System.out.print("Ingresa el valor de costo por km: ");
      costo_por_km = in.nextDouble();
      in.nextLine();
      System.out.print("Ingresa el valor de presupuesto: ");
      presupuesto = in.nextDouble();
      in.nextLine();
      if(costo_por_km*750*2<=presupuesto)
        System.out.println("Mexico");
      else
        System.out.println("Quedarse en casa");
      if(costo_por_km*800*2<=presupuesto)
           System.out.println("Acapulco");
      if(costo_por_km*1200*2<=presupuesto)
        System.out.println("Puerto Vallarta");
      if(costo_por_km*1800*2<=presupuesto)
      System.out.println("Cancun");
      in.close();
    }

}