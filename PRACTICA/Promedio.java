public class Promedio {
    public static void main(String[] args) {
        int matematica = 9;
        int fisica = 11;
        int quimica = 10;
        int promedio = 0;
        promedio = (fisica + quimica + matematica) /3;
        if(promedio >=11){
          System.out.println("el alumno aprovo: " + promedio); 
        }else {
            System.out.println("el alumno reprovo: " + promedio);
        }
    }
}
