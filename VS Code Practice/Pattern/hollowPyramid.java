public class hollowPyramid {
      public static void main(String[] args) {
        int n= 4;
         for(int row =1; row<=n;row++){
             //print sapce 
             for(int space =1;space<=n-row;space++){
                System.out.print(' ');
             }
             if(row == 1 || row == n){
                 for( int star =1 ;star<=2*row-1;star++){
                System.out.print("*");
             }
            }
             else{
                System.out.print("*");
                for(int s=1;s<=2*row-3;s++){
                          System.out.print(" ");
                }
                System.out.print("*");
             }
            System.out.println();
             }
         }
    }
