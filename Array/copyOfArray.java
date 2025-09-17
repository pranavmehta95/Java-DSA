package Array;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {23,43,23,54,53,24};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        // int[] nums = arr; //shallow copy
        // nums[0] = 99;
        // System.out.println(arr[0]);
        //deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 99;
        System.out.println(arr[0]);
        // for(int i:brr){
        //     System.out.print(i+" ");
        // }
        // for(int n:nums){
        //     System.out.print(n+" ");
        // }
        
    }
    
}
