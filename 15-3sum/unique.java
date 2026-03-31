import java.util.*;
public class Unique{
     public static void main(String[] args) {
        int[] arr = {1,5,7,3,2,4,7,2,2,5,6,8,90,5,3,2,1,1,3,46,7,8};
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[j+1]= arr[i];
                j++;
            }
        }
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}