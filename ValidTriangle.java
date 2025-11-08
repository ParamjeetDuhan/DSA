class checkTriangle{
    public static void basedOnSide(int a, int b, int c){
        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
            System.out.println("Triangle is valid");
        }
        else{
             System.out.println("Triangle is  not valid");
        }
    }
        public static void basedOnAngle(int a, int b, int c){
        if (a+b+c==180) {
            System.out.println("Triangle is valid");
        }
        else{
             System.out.println("Triangle is  not valid");
        }
    }
}
public class ValidTriangle {
    public static void main(String[] args) {
        checkTriangle.basedOnSide(2,2,6);
        checkTriangle.basedOnAngle(60,30,90);
    }
}
