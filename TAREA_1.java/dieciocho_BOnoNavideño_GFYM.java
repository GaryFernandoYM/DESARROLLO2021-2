
    import java.util.Scanner;

    public class dieciocho_BOnoNavideño_GFYM {
    
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double antiguedad, bono_navideno, sueldo;
            System.out.print("Ingresa el valor de antiguedad: ");
            antiguedad = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de sueldo: ");
            sueldo = in.nextDouble();
            in.nextLine();
            if(antiguedad>4||sueldo<2000)
                bono_navideno=sueldo*0.25;
            else
                bono_navideno=sueldo*0.2;
            System.out.println("Valor de bono navideno: " + bono_navideno);
            in.close();
        }
    
    }