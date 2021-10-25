import java.util.Random;
import java.util.Scanner;
public class DiezEjerciciosGFYM {
     static Scanner sc = new Scanner(System.in);

    //ejercicio 4.9
    public static void inversionmensual() {
        //variables
        double Dmensual, IfijoAnual, monto=0, capAnual=0;
        int meses, Naños;
        //datos de entrada
        System.out.print("Ingrese el deposito mensual: ");
        Dmensual=sc.nextDouble();
        System.out.print("ingrese el año limite de su inversion: ");
        Naños=sc.nextInt();
        IfijoAnual=0.10;
        meses=12;
        for (int año = 1; año <= Naños; año++) {
            capAnual = monto + (capAnual+Dmensual*meses);
            monto = capAnual + (capAnual*IfijoAnual);
            System.out.println("\nEl  capital total del año "+año+ " es: "+capAnual+
            " \ny su monto (capital + interes que recibe) es: "+monto);
        }
    }


        //ejercicio 4.5
    public static void ahorrodiarioenpeso(){
        //variables
        double ahorrodiario;
        //datos de entrada;
        double ahorro1deenero=3;
        //unañotiene365dias;
        for (int dia=1; dia<=365; dia++){
            System.out.println("el ahorro en el");
            ahorrodiario=Math.pow(ahorro1deenero, dia);
            System.out.println("dia "+dia+" es "+ahorrodiario+" pesos");


        }
    }

    //ejercicio 4.16
    public static void cubodenumeros() {
        //varibles 
        int numero=0, resultado=0;
        do {
            System.out.println("ingrese el numero:");
            numero=(int) sc.nextDouble();
            resultado=(int)Math.pow(numero, 3);
            System.out.println("el cubo del numero "+numero+" es: "+resultado);
        } while (numero>0);

    }

    //ejercicio 4.4
    public static void fabricaDeFocosDeColor() {
        //definir Variables
        int NFocos, FVerde=0, FBlanco=0, FRojo=0;
        //Datos de entrada
        System.out.println("Ingrese N cantidad de Focos de colores:");
        NFocos=sc.nextInt();
        //Proceso
        for (int foco = 1; foco <= NFocos; foco++) {
            System.out.print("Ingrese el color (V=Verde, B=Blanco y R=Rojo) "+
            "del color de foco y numero "+foco+":");
            String color=sc.next();
            if(color.toUpperCase().equals("V")){ FVerde++; }
            if(color.toUpperCase().equals("B")){ FBlanco++; }
            if(color.toUpperCase().equals("R")){ FRojo++; }
           
        }
        //Datos de salida
        System.out.println("Del cantidad de focos:\n"+FVerde+" son Verde(s)\n"+
        FBlanco+" son Blanco(s)\n"+FRojo+" son Rojo(s)\nEn  cantidad total son:"+NFocos);
    }

    //ejercicio 4.17
    public static void TablaDeMultiplicacionDeUnENtero() {
        System.out.println("Tabla de multiplicación");
        //variables
        int n, multiplicador;
        //datos de entrada 
        System.out.print("\ningrese el numero entero positivo a multiplicar: ");
        n = sc.nextInt();
        System.out.print("ingrese el limite de tu multiplicador: ");
        multiplicador=sc.nextInt();  
        if (n>0) {
            for (int i=1; i<=multiplicador; i++){
                System.out.println(n+"x"+i+" = "+n*i);
            }
        } else {
            System.out.println("el numero que ingreso es invalido" ); 
        }
        System.out.println("buena suerte en la tabla de multiplicacion");
    }

    //ejercicio 4.2
    public static void pagoHamburgesasCencillas() {
    //Daclarar Variables
    String tipoPago;
    int cantidad;
    double totalPago=0;
    int contador=1;
    //proceso y datos de Entrada
    do {
        if (contador==1) {
            System.out.println("Ingrese la cantidad de hamburgesas cencillas:");
            cantidad=sc.nextInt();
            totalPago=totalPago+cantidad*20;
        }
        if (contador==2) {
            System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
            cantidad=sc.nextInt();
            totalPago=totalPago+cantidad*25;
        }
        if (contador==3) {
            System.out.println("Ingrese la cantidad de hamburgesas Triples:");
            cantidad=sc.nextInt();
            totalPago=totalPago+cantidad*28;
        }  
        contador++;                  
    } while (contador<=3);
    //datos de salida, entrada
    System.out.println("Ingrese es estilo de pago (Con tarjeta=CT, Sin tarjeta=ST):");
    tipoPago=sc.next();
    if (tipoPago.toUpperCase().equals("CT")) {
        totalPago=totalPago+totalPago*0.05;
    } 
    System.out.println("El monto total a pagar es:"+totalPago);
    }

  //ejercicio 4.8
  public static void TotalApagarArticulos() {
    //Daclarar Variables
    double montoPagarArt=0, montoPagarT=0, precio, descuento;
    int cantArt1=0, cantArt2=0, cantArt3=0;
    double CantArticulo;
    //datos de Entrada
    System.out.print("Ingrese N cantidad de articulos: ");
    CantArticulo=sc.nextInt();
    Random precioAleatorio = new Random();
    //Proceso
    for (int art=1; art<=CantArticulo; art++) {
        System.out.println("");
        precio = precioAleatorio.nextInt(300-1); //el precio maximo es solo un supuesto
        System.out.println("El precio del articulo es: "+precio);
        if (precio>200) {cantArt1++;} 
        if (precio<200) if (precio>100) {cantArt2++;} 
        if (precio<=100) {cantArt3++;}
        
        
        if (precio>200) {
            montoPagarArt=precio-(precio*0.15);
            descuento=precio*0.15;
            System.out.println("El  monto a pagar del articulo es "+montoPagarArt+ " y su descuento es "+descuento);}
            
        if (precio<200) if (precio>100) {
            montoPagarArt=precio-(precio*0.12);
            descuento=precio*0.12;
            System.out.println("El  monto a pagar del articulo es: "+montoPagarArt+ " y su descuento es "+descuento);}
            
        if (precio<=100) {
            montoPagarArt=precio-(precio*0.10);
            descuento=precio*0.10;
            System.out.println("El  monto a pagar del articulo es: "+montoPagarArt+ " y su descuento es "+descuento); }  
    montoPagarT= montoPagarT+montoPagarArt;
    }
    //datos de salida
    System.out.println("\nDel total de articulos:\n"+cantArt1+" es/son de precio mayor a 200 soles"+
    "\n"+cantArt2+" es/son de precio entre 200 y 100 soles"+
    "\n"+cantArt3+" es/son de precio menores o iguaes a 100 soles"
    );
    System.out.println("\nEl precio total de todos los articulos es: "+montoPagarT+" soles");
    

}
    //ejercicio 4.14
    public static void CalificacionesDeNAlunnos() {
    int alumnos;
    int aprobados=0;
    int desaprobados=0;
    float nota=0;
    int i=1;

    System.out.println("introdusca total de alumnos: ");
    alumnos =sc.nextInt();
    while (i<=alumnos){
        
        System.out.println("introdusca la nota de 0 a 20 nota del alumno: "+i);
        nota = sc.nextFloat();
        if (nota>= 0 && nota<=12);
        {
            desaprobados++;
        }
        if (nota>=13 && nota<=20)
                {
                aprobados++;
                }
        i++;
        
    }
        System.out.println("numero de aprobados: "+aprobados);
        System.out.println("numero de desaprobados: "+desaprobados);
    }
    //ejercicio 4.15
    public static void SueldoDeNTrabajadores() {
        int Ntrabajadores;
        double sueldo, stotal=0, porcentaje;
        String nombre;
        int i=1;
        System.out.println("ingrese en numero de trabajadores: ");
        Ntrabajadores = sc.nextInt();
        while (i<=Ntrabajadores){
            System.out.println("ingrese el nombre del trabajador: "+i);
            nombre = sc.next();
            System.out.println("ingrese el sueldo del trabajador: "+i);
            sueldo = sc.nextDouble();
            
            if (sueldo>= 0 && sueldo<=150){
             
            porcentaje = sueldo * 5/100;
            stotal = sueldo - porcentaje;
            }
            if (sueldo>= 151 && sueldo<=299){
            porcentaje = sueldo * 7/100;
            stotal = sueldo - porcentaje;
            }
            if (sueldo>= 300 && sueldo<=450){
            porcentaje = sueldo * 9/100;
            stotal = sueldo - porcentaje;
            }
            
        System.out.println("el nombre del trabajador es: "+nombre);
        System.out.println("el salario del trabajador es: "+stotal);
        i++;
         }
        }
    //ejercicio 4.19  
    public static void determinaInpuestoAPagar() {
        int i, n;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        System.out.print("Ingresa el valor de n: ");
        n = sc.nextInt();
        sc.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("clave(1)");
            System.out.print("clave(2)");
            System.out.print("clave(3)");
            System.out.println();
            System.out.print("PROCESO  " + i);
            System.out.print("\tIngresa el valor de clave: ");
            clave = sc.nextDouble();
            sc.nextLine();
            System.out.print("\tIngresa el valor de costo: ");
            costo = sc.nextDouble();
            sc.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria_1=categoria_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria_2=categoria_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria_3=categoria_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }


    static void menuOpciones_GFYM(){ 
      // datos de entrada  
      int opcionesA=0;
      String msg="\n ELIJA LAS OPCIONES DISPONIBLES";
      System.out.println(msg);
      String msg1= "(1) ";
              System.out.println(msg1);
              String msg2= "(2)  ";
              System.out.println(msg2);
              String msg3= "(3) ";
              System.out.println(msg3);
              String msg4= "(4) "; 
              System.out.println(msg4);
                opcionesA=sc.nextInt();
              //Proceso 
                while(opcionesA!=0){
                    switch(opcionesA) {
                    case 1:inversionmensual();break;
                    case 2:ahorrodiarioenpeso();break;
                    case 3:cubodenumeros();break;
                    case 4:fabricaDeFocosDeColor();break;
                    case 5:TablaDeMultiplicacionDeUnENtero();break;
                    case 6:pagoHamburgesasCencillas();break;
                    case 7:TotalApagarArticulos();break;
                    case 8:CalificacionesDeNAlunnos();break;
                    case 9:SueldoDeNTrabajadores();break;
                    case 10:determinaInpuestoAPagar();break;
              
              //fin   
                    default:
                    System.out.println("El Algoritmo no existe!");
                  }   
                System.out.println("___________________________________________________________________________________________");  
                System.out.println(msg);
                opcionesA=sc.nextInt();        
              }
            }
    public static void main(String[] arg) {
      menuOpciones_GFYM();





    }
}