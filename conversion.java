class unitConversion{
    public static void cm_To_m(int cm){
             int m = (cm/100);
             System.out.println(m);
    }
      public static void kg_To_gm(int kg){
             int gm = (kg*1000);
             System.out.println(gm);
    }
}
public class conversion {
    public static void main(String[] args) {
      unitConversion.cm_To_m(100);
      unitConversion.kg_To_gm(1);
    }
}
