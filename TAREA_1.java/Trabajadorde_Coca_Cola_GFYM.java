import java.util.Scanner;
public class Trabajadorde_Coca_Cola_GFYM  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hora_trabajada, horas_extras_diurnas, horas_extras_nocturnas, pension, salud;
        double sueldo_basico, sueldo_bruto, sueldo_neto, transporte;
        System.out.print("Ingresa el valor de hora trabajada: ");
        hora_trabajada = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de horas extras diurnas: ");
        horas_extras_diurnas = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de horas extras nocturnas: ");
        horas_extras_nocturnas = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de sueldo basico: ");
        sueldo_basico = in.nextDouble();
        in.nextLine();
        sueldo_bruto=sueldo_basico+horas_extras_diurnas*hora_trabajada*1.04+horas_extras_nocturnas*hora_trabajada*1.06;
        salud=sueldo_bruto*0.02;
        pension=sueldo_bruto*0.04;
        transporte=sueldo_bruto*0.03;
        sueldo_neto=sueldo_bruto-salud+pension+transporte;
        System.out.println("Valor de pension: " + pension);
        System.out.println("Valor de salud: " + salud);
        System.out.println("Valor de sueldo bruto: " + sueldo_bruto);
        System.out.println("Valor de sueldo neto: " + sueldo_neto);
        System.out.println("Valor de transporte: " + transporte);
        in.close();
    }

}