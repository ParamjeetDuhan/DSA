public class invertedPyramid {
    public static void main(String[] args) {
        int n=4;
        for(int row = 1; row<=n;row++){
            //space
            int space = row-1;
            for(int s = 1;s<=space;s++){
                System.out.print(" ");
            }
            //star
            int star = 2*n-row-space;
            for(int str=1;str<=star;str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
