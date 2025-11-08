class CheckTheNumber {
    public static void checkNumbers(int a) {
        if (a > 0) {
            System.out.println("Positive number");
        } else if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
public class checkNumber {
        public static void main(String[] args) {
        CheckTheNumber.checkNumbers(0);
    }
}
