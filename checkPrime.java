class checkPrimeNumber{
    public static void checkPrimeOrNot(int N){
        int count =1;
        for(int i=2;i<=N;i++){
            if(N%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println("Given number is prime");
        }
        else{
            System.out.println("Given number is not Prime number");
        }
    }
}
public class checkPrime {
    public static void main(String[] args) {
        checkPrimeNumber.checkPrimeOrNot(12);
    }
}
