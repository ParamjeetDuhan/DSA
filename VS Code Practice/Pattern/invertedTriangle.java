public class invertedTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1 ; row<=n ;row++){
            for(int j = 1 ; j<=n-row+1;j++){
                System.err.print("* ");
            }
            System.err.println();
        }
    }
}
