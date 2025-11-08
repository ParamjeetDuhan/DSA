class sumofNumber{
    public static void sumOfNaturalNumbers(int N){
         int sum=0;
        for(int i=1;i<=N;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    
}
public class sumOfNaturalNumber {
    public static void main(String[] args) {
        sumofNumber.sumOfNaturalNumbers(10);
    }
}
