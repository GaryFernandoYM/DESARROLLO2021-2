import java.util.Scanner;
public class Factorial{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int resultado=0;
       System.out.println("ingrese el primer valor: ");
       int numero1=sc.nextInt();
       System.out.println("ingrese el segundo valor: ");
       int numero2=sc.nextInt();
       for(int i=numero1; i<numero2;i++){
           if(i%2==0);
           resultado=resultado+i;
           System.out.println("# :"+i+ " sumaNumPar:"+resultado);
            
        }
        System.out.println("La suma de numeros pares es:"+resultado);

     }   
}