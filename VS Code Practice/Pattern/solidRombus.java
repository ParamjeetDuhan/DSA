public class solidRombus {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<n ;row++){
             for(int space = 1; space<=n-row;space++){
                System.err.print(' ');
             }
             for(int star =1 ;star<=5;star++){
                System.out.print("* ");
             }
             System.err.println();
        }
    }
}
