import java.util.Scanner;

class Ciclo{ 
  static Scanner sc = new Scanner(System.in);

static void suma20mumerosPareswhile(){
    //Declarar variables e inicializacion de valores
    int numInit=1, sumaNumPar=0;
    //Proceso
      while(numInit <= 20) {
        if(numInit%2==0){
          sumaNumPar=sumaNumPar+numInit;
        }
        numInit++;//numInit=numInit+1;
      }
    //Datos de Salida
      System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);

    }  
    static void suma20mumerosfor(){
        //Declarar variables e inicializacion de valores
        int sumaNumPar=0;
        //Proceso
          for (int numInit=1; numInit <= 20; numInit++) {
            if(numInit%2==0){
              sumaNumPar=sumaNumPar+numInit;
            }
            System.out.println("numInit:"+numInit+ " sumaNumPar:"+sumaNumPar);
          }
        //Datos de Salida
          System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
    
        }  
        static void menuOpciones(){ 
          int opcionesA=0;
          System.out.println("-------------------------------");
          String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx,2=xxxx,3=numeros pares:";
          System.out.println(msg);
            opcionesA=sc.nextInt();  
            while(opcionesA!=0){
                switch(opcionesA) {
                  case 1: suma20mumerosPareswhile();break;
                  case 2: suma20mumerosfor();break;
                  default:
                  System.out.println("El Algoritmo no existe!");
              }   
            System.out.println("------------------------------");  
            System.out.println(msg);
            opcionesA=sc.nextInt();        
          }
        }
    public static void main(String[] args) {
      System.out.println("Holas Est. Repetitivas");
      menuOpciones();
        
    }  
  }