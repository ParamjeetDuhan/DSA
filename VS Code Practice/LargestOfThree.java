 class InnerLargestOfThree {
 public static void check(int a, int b, int c){
    if ((a>b && a>c)) {
        System.out.println("a is  Largest");
    }
 else if((b>a && b>c)){
     System.out.println("b is  Largest");
 }
 else{
     System.out.println("c is  Largest");
 }
 }
    
}
public class LargestOfThree {
 public static void main(String[] args){
     InnerLargestOfThree.check(20,3,123);
 }
}