package TAREA_2;

import java.util.Scanner;
  public class DiezEjercicios {
     static Scanner sc = new Scanner(System.in);

      static void AhoroDeunaPersona() {      
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
      static void Aprobadosydesaprovados() {
        Scanner sc = new Scanner(System.in);
        int aprobados, i, n, reprobados;
        double calificacion, calificacion_aprobatoria;
        aprobados = 0;
        reprobados = 0;
        System.out.print("Ingrese la Calificacion Aprovatoria : ");
        calificacion_aprobatoria = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese la cantidad de alumnos : ");
        n = sc.nextInt();
        sc.nextLine();
        for (i=1; i<=n; i++) {
            System.out.println();
            System.out.print("alumno " + i);
            System.out.print("   ingrese la calificacion : ");
            calificacion = sc.nextDouble();
            sc.nextLine();
            if(calificacion>=calificacion_aprobatoria)
                aprobados=aprobados+1;
            else
                reprobados=reprobados+1;
            System.out.println();
        }
        System.out.println("Valor de aprobados: " + aprobados);
        System.out.println("Valor de reprobados: " + reprobados); 
       }
      static void ClienteDelBanco() {
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
    static void ColorDEfocos(){
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
  
     static void CuboDeNumeros(){
              //varibles 
              int numero=0, resultado=0;
              do {
                  System.out.println("ingrese el numero:");
                  numero=(int) sc.nextDouble();
                  resultado=(int)Math.pow(numero, 3);
                  System.out.println("el cubo del numero "+numero+" es: "+resultado);
              } while (numero>0); 
      }
      static void ElNaufragoSatisfecho(){
        int forma_de_pago, i, n, tipo_de_hamburguesa;
        double cargo, costo, pago;
        pago = 0;
        System.out.print("Ingresa el valor de n: ");
        n = sc.nextInt();
        sc.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.println("Selecciona el valor de tipo de hamburguesa.");
            System.out.println("\t1.- S sencilla");
            System.out.println("\t2.- D doble");
            System.out.println("\t3.- T triples");
            System.out.print("\t: ");
            do {
                tipo_de_hamburguesa = sc.nextInt();
                sc.nextLine();
                if (tipo_de_hamburguesa<1||tipo_de_hamburguesa>3)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } while (tipo_de_hamburguesa<1||tipo_de_hamburguesa>3);
            costo=0;
            if(tipo_de_hamburguesa==1)
                costo=10000;
            if(tipo_de_hamburguesa==2)
                costo=15000;
            if(tipo_de_hamburguesa==3)
                costo=28000;
            System.out.println("Selecciona el valor de forma de pago.");
            System.out.println("\t1.- Efectivo");
            System.out.println("\t2.- Tarjeta");
            System.out.print("\t: ");
            do {
                forma_de_pago = sc.nextInt();
                sc.nextLine();
                if (forma_de_pago<1||forma_de_pago>2)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } while (forma_de_pago<1||forma_de_pago>2);
            if(forma_de_pago==1)
                cargo=0;
            else
                cargo=costo*0.05;
            pago=pago+costo+cargo;
            System.out.println("Valor de cargo: " + cargo);
            System.out.println("Valor de costo: " + costo);
            System.out.println();
        }
        System.out.println("Valor de pago: " + pago);
    }
    static void ImpuestoAutomotriz(){
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
    static void Monedero(){
        int billetes_de_cincuenta, billetes_de_diez, billetes_de_veinte, cantidad_de_dinero, monedas_de_cinco;
        int monedas_de_diez, monedas_de_un_peso;
        System.out.print("Ingresa el valor de billetes de cincuenta: ");
        billetes_de_cincuenta = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el valor de billetes de diez: ");
        billetes_de_diez = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el valor de billetes de veinte: ");
        billetes_de_veinte = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el valor de monedas de cinco: ");
        monedas_de_cinco = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el valor de monedas de diez: ");
        monedas_de_diez = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el valor de monedas de un peso: ");
        monedas_de_un_peso = sc.nextInt();
        sc.nextLine();
        cantidad_de_dinero=monedas_de_diez*10+monedas_de_cinco*5+monedas_de_un_peso+billetes_de_diez*10+billetes_de_veinte*20+billetes_de_cincuenta*50;
        System.out.println("Valor de cantidad de dinero: " + cantidad_de_dinero);
      }
      static void MultiplicacionDeUnEntero(){
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

      //ejercicio 4.8
    static void PagoDe_N_Articulos() { 
      int i, n;
      double costo, descuento, pago_por_todo, precio;
      pago_por_todo = 0;
      System.out.print("Ingresa el valor de n: ");
      n = sc.nextInt();
      sc.nextLine();
      for (i=1; i<=n; i++) {
          System.out.print("PROCESO " + i);
          System.out.print("  Ingresa el valor de precio: ");
          precio = sc.nextDouble();
          sc.nextLine();
          descuento=precio*0.1;
          if(precio>=200)
              descuento=precio*0.15;
          if(precio>100&&precio<200)
              descuento=precio*0.12;
          costo=precio-descuento;
          pago_por_todo=pago_por_todo+costo;
          System.out.println("Valor de costo: " + costo);
          System.out.println("Valor de descuento: " + descuento);
          System.out.println();
      }
      System.out.println("Valor de pago por todo: " + pago_por_todo);
    }
    


    
    static void menuOpciones_GFYM(){ 
    // datos de entrada  
    int opcionesA=0;
          String msg="\n ELIJA LAS OPCIONES DISPONIBLES";
          System.out.println(msg);
          String msg1= "(1) El ahorro de una persona";
          System.out.println(msg1);
          String msg2= "(2) Calificaciones ";
          System.out.println(msg2);
          String msg3= "(3) Cliente de un Banco ";
          System.out.println(msg3);
          String msg4= "(4) Color de focos "; 
          System.out.println(msg4);
          String msg5= "(5) El cubo de un numero ";
          System.out.println(msg5);
          String msg6= "(6) * El naufrago *  ";
          System.out.println(msg6);
          String msg7= "(7) impuesto de un automotriz ";
          System.out.println(msg7);
          String msg8= "(8) Monedero "; 
          System.out.println(msg8);
          String msg9= "(9) Multiplicacion de un numero Entero";
          System.out.println(msg9);
          String msg10= "(10) Pago de Articulos N ";
          System.out.println(msg10);
          System.out.println("----------------------------");
            opcionesA=sc.nextInt();
          //Proceso 
            while(opcionesA!=0){
                switch(opcionesA) {
                case 1:AhoroDeunaPersona();break;
                case 2:Aprobadosydesaprovados();break;
                case 3:ClienteDelBanco();break;  
                case 4:ColorDEfocos();break;
                case 5:CuboDeNumeros();break; 
                case 6:ElNaufragoSatisfecho();break;
                case 7:ImpuestoAutomotriz();break; 
                case 8:Monedero();break;
                case 9:MultiplicacionDeUnEntero();break;
                case 10:PagoDe_N_Articulos();break;          
          //fin   
                default:
                System.out.println("Vuelva a escribir el algoritmo!");
              }   
            System.out.println("____________________________________________");  
            System.out.println(msg);
            opcionesA=sc.nextInt();        
          }
        }       
  
      public static void main(String[] args) {
      System.out.println("************************************");
      System.out.println("* BIENVENIDOS AL PANEL DE OPCIONES *");
      System.out.println("************************************");
      menuOpciones_GFYM();
      sc.close();
    }
  }


