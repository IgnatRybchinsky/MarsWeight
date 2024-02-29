public class Main {
    public static void main(String[] args)
    { float EarthWeightRybchinsky = 72;
      float MarsWeightRybchinsky;
      float resaltf= (EarthWeightRybchinsky * 0.38f) ;
        System.out.println("Weight on mars in float: "+resaltf );
      double resaltd= (double) resaltf;
        System.out.println("Weight on mars in double: "+resaltd );
      int resalti = (int) resaltd;
        System.out.println("Weight on mars in int : "+resalti );
      char resaltc = (char) resalti;

      System.out.println("Weight on mars in char: " +resaltc );

      int math = (int)resaltc*(int)resaltc;

        System.out.println("Math with char: "+math );


    }
}