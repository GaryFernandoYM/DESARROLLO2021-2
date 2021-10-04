import java.util.Scanner;
public class DiasSemanales {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int dia;
   //
   System.out.println("**********************************");
   System.out.println("**INGRESE EL NUMERO DE LA SEMANA**");
   System.out.println("**********************************");
   dia = sc.nextInt();
   switch (dia){
     case 1:
     System.out.println("el dia el lunes");
     break;
     case 2:
     System.out.println("el dia el martes");
     break;
     case 3:
     System.out.println("el dia el miercoles");
     break;
     case 4:
     System.out.println("el dia el jueves");
     break;
     case 5:
     System.out.println("el dia el viernes");
     break;
     case 6:
     System.out.println("el dia el sabado");
     break;
     case 7:
     System.out.println("el dia el domingo");
     break;
     default:
     System.out.println("el dia no existe");
   }
     
  }

  
   
}
