package ArrayProblems;

import java.util.*;

public class findlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int x : arr) {
            if (max < x) {
                max = x;
            }
        }

        System.out.println("Largest element is: " + max);
    }
}
