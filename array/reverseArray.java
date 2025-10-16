package array;
import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {23,43,54,22,45,46,34,70,64};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //reversing the array
        // for(int i=0;i<n/2;i++){
        //     int j=n-1-i;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }

        //or [With the two pointer approach]
        // int i = 1, j = 5;   - Part of array reverse kaise kree that's how it works.
        int i = 0, j = n-1;
        while(i<=j){
            // int temp = arr[i];
            // arr[i] = arr[j];
            // arr[j] =temp;

            //or i can use funtion to swap
            swap(arr,i,j);
            i++;
            j--;
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
