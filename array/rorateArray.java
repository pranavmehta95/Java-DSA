package array;
import java.util.Scanner;
public class rorateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        int size = sc.nextInt();
        int arr[] = new int[size];
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        steps = steps % n; //in case steps > n
        //step 1: reverse the whole array
        reverse(arr,0,n-1);
        //step 2: reverse first k elements
        reverse(arr,0,steps-1);
        //step 3: reverse the remaining elements
        reverse(arr,steps,n-1);
        for(int ele: arr){
             System.out.print(ele+" ");
         }
         System.out.println();
    }
    public static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
