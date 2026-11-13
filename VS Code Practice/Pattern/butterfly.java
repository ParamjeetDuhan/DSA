public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1;row<=n;row++){
            for(int upperleftStar=1;upperleftStar<=row;upperleftStar++){
                System.out.print("* ");
            }
            for(int upperspace = 1; upperspace<=2*(n-row);upperspace++ ){
                System.out.print("  ");
            }
             for(int upperrightStar=1;upperrightStar<=row;upperrightStar++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1;row<=n;row++){
            for(int lowerleftStar=1;lowerleftStar<=n-row+1;lowerleftStar++){
                System.out.print("* ");
            }
            for(int lowerspace = 1; lowerspace<=2*(row-1);lowerspace++ ){
              System.out.print("  ");
            }
             for(int lowerrightStar=1;lowerrightStar<=n-row+1;lowerrightStar++){
                System.out.print("* ");
             }
            System.out.println();
        }
    }
}
