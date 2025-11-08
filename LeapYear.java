 class InnerLeapYear {
   public static void check(int year){
         if(( year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Given  year is a leap  year");
         }
         else{
         System.out.println("Given  year is not a leap  year");
         }
   }
    
}
public class LeapYear {
  public static void main(String[] args) {
    InnerLeapYear.check(2028);
  }
}