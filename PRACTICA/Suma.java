import java.util.Scanner;

class Suma {
static Scanner sc = new Scanner(System.in);

    static void pesca() {
     
      double bono, puntos, salario_minimo;
      System.out.print("Ingresa el valor de puntos: ");
      puntos = sc.nextDouble();
      sc.nextLine();
      System.out.print("Ingresa el valor de salario minimo: ");
      salario_minimo = sc.nextDouble();
      sc.nextLine();
      bono=0;
      if(puntos<=100)
          bono=salario_minimo;
      if(puntos>100&&puntos<=150)
          bono=salario_minimo*2;
      if(puntos>150)
          bono=salario_minimo*3;
      System.out.println("Valor de bono: " + bono);
      sc.close();
      
        
       
    }
    

      static void correr(){
          Scanner sc = new Scanner(System.in);
          double dinero_recibido;
          System.out.print("Ingresa el valor de dinero recibido: ");
          dinero_recibido = sc.nextDouble();
          sc.nextLine();
          if(dinero_recibido>=50000)
              System.out.println("Paquete A");
              System.out.println("Television,"+ "Un modular,"+"Tres parese de Zapatos,"+"cinco camisas,"+"y cinco pantalones.");
          if(dinero_recibido>=20000&&dinero_recibido<50000)
              System.out.println("Paquete B");
              System.out.println("una grabadora,"+" tres pares de zapatos," +"cinco camisas"+ "y cinco pantalones");
          if(dinero_recibido>=10000&&dinero_recibido<20000)
              System.out.println("Paquete C");
              System.out.println("dos pares de zapatos,"+ "tres camisas"+ "y tres pantalones.");
          if(dinero_recibido<10000)
              System.out.println("Paquete D");
              System.out.println("un par de zapatos,"+" dos camisas " +"y dos pantalones.");
              sc.close();
    
     } 
     static void menuOpciones(){ 
        int opcionesA=0;
        System.out.println("-------------------------------");
        String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx,2=xxxx,3=numeros pares:";
        System.out.println(msg);
          opcionesA=sc.nextInt();  
          while(opcionesA!=0){
              switch(opcionesA) {
                case 1:pesca();break;
                case 2:correr();break;
                default:
                System.out.println("El Algoritmo no existe!");
            }   
          System.out.println("------------------------------");  
          System.out.println(msg);
          opcionesA=sc.nextInt();        
        }
      }       

 public static void main(String[] args){ 
    System.out.println("Holi holis");
    int opcionesA=0;
    System.out.println("-------------------------------");
    String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx,2=xxxx,3=numeros pares:";
    System.out.println(msg);
      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
            case 1:pesca();break;
            case 2:correr();break;
            default:
            System.out.println("El Algoritmo no existe!");
        }   
      System.out.println("------------------------------");  
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
}
  
}