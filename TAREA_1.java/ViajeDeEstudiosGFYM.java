import java.util.Scanner;

public class ViajeDeEstudiosGFYM   {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int costo_del_pasaje, numero_de_alumnos;
        System.out.print("Ingresa el valor de numero de alumnos: ");
        numero_de_alumnos = in.nextInt();
        in.nextLine();
        costo_del_pasaje=70;
        if(numero_de_alumnos>=20)
            costo_del_pasaje=40;
        if(numero_de_alumnos>=40)
            costo_del_pasaje=35;
        if(numero_de_alumnos>100)
            costo_del_pasaje=20;
        System.out.println("Valor de costo del pasaje: " + costo_del_pasaje);
        in.close();
    }

}