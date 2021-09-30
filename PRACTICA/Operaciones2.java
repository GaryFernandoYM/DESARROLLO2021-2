public class Operaciones2 {
  public static void main(String[] args) {
     int operacion = 4;
     int numero_uno =4;
     int numero_dos =8;
     int resultado = 0;
     if(operacion == 1){
        resultado = numero_uno + numero_dos;
       System.out.println("el resultado de la suma es: " + resultado);
      } else if(operacion == 2){
         resultado = numero_uno - numero_dos;
         System.out.println("el resultado de la resta es:" + resultado);
       } else if(operacion == 3){
          resultado = numero_uno * numero_dos;
          System.out.println("el resultado de la multiplicacon es:" + resultado);
        } else if(operacion == 4){
          resultado = numero_dos/numero_uno;
          System.out.print("el resultado de la division es");
         } else{
           System.out.println("la opcion no existe");
          }
   }
 }