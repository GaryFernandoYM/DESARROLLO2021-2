package ProblemasDEclase;
import java.util.Scanner;

public class AsisnaturasCURSADAS{
  public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);
        //definir variables e inicializacion de valores
        int asigCod, calf, cred, cantAsigCur=0, cont=0;
        double promPond=0, sumCred=0, temp=0;
        //Datos de entrada proceso
        System.out.println("Ingrese el codigo la asignatura:");
        asigCod=sc.nextInt();
        while(asigCod!=9999){
          System.out.println("Ingrese la calificacion del curso "+asigCod+":");
          calf=sc.nextInt();
          System.out.println("Ingrese el numero de creditos del curso "+asigCod+":");
          cred=sc.nextInt();
          temp=temp+(calf*cred);
          sumCred=sumCred+cred;
          cont++;
          System.out.println("Ingrese el codigo la siguiente asignatura:");
          asigCod=sc.nextInt();
            if(asigCod==9999){
              if(sumCred>=25 && sumCred<=50){
                promPond=Math.round((temp/sumCred)*100.0)/100.0;
              }else{
                System.out.println("La cantidad de creditos no estan entre los rangos permitidos..intente nuevamente");
                System.out.println("Ingrese el codigo la asignatura:");
                asigCod=sc.nextInt();
                temp=0;
                sumCred=0;
                cont=0;
                sc.close();
              }
            }
        }
    }  
}
    
    

