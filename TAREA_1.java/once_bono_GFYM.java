import java.util.Scanner;

public class once_bono_GFYM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int antiguedad, bono;
        System.out.print("Ingresa el valor de antiguedad: ");
        antiguedad = in.nextInt();
        in.nextLine();
        if(antiguedad<=5)
            bono=antiguedad*100;
        else
            bono=1000;
        System.out.println("Valor de bono: " + bono);
        in.close();
    }

}