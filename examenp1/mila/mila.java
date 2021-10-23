package mila;
import java.util.Scanner;

public class mila {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int resultado =0;
        System.out.println("primer numero: ");
        int numero1=sc.nextInt();
        System.out.println("segundo numero: ");
        int numero2=sc.nextInt();
        System.out.println("elija el metodo" );
        System.out.print("1.-suma");
        System.out.print("2.-resta");
        int operaciones=sc.nextInt();
        switch(operaciones){
            case 1: resultado=numero1+numero2;
            System.out.println("la suma es:"+resultado);break;
            case 2: resultado=numero1-numero2;
            System.out.println("la resta es:"+resultado);break;
            case 3: resultado=numero1*numero2;
            System.out.println("la multiplicacion es:"+resultado);break;
            case 4: resultado=numero1/numero2;
            System.out.println("la division es:"+resultado);break;

            default: System.out.println("la operacion no existe:");
         }

     }

        
    }
 

