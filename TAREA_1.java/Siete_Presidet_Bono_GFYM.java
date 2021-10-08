import java.util.Scanner;

public class Siete_Presidet_Bono {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double beca, edad, promedio;
        System.out.print("Ingresa el valor de edad: ");
        edad = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de promedio: ");
        promedio = in.nextDouble();
        in.nextLine();
        beca=0;
        
        if(edad>18&&promedio>=9)
            beca=2000;
        if(edad>18&&promedio>=7.5&&promedio<9)
            beca=1000;
        if(edad>18&&promedio>=6&&promedio<7.5)
            beca=500;
        if(edad<=18&&promedio>=9)
            beca=3000;
        if(edad<=18&&promedio>=8&&promedio<9)
            beca=2000;
        if(edad>18&&promedio>=6&&promedio<8)
            beca=100;
        if(promedio<6)
            System.out.println("Se env\u00EDa carta de invitaci\u00F3n a estudiar m\u00E1s");
            System.out.println("Valor de beca: " + beca);
            in.close();
    }

}