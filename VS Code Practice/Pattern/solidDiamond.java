public class solidDiamond {
    public static void main(String[] args) {
        int n= 4;
         for(int row =1; row<=n;row++){
             //print sapce 
             for(int space =1;space<=n-row;space++){
                System.out.print(' ');
             }
             for( int star =1 ;star<=2*row-1;star++){
                System.out.print("*");
             }
             System.out.println();
         }
         int j=3;
        for(int row = 1; row<=j;row++){
            //space
            System.out.print(" ");
            int space = row-1;
            for(int s = 1;s<=space;s++){
                System.out.print(" ");
            }
            //star
            int star = 2*j-row-space;
            for(int str=1;str<=star;str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
