package array;
import java.util.Scanner;
public class greatestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[arr.length];
        ans[arr.length-1] = -1;
        //Method 1: Brute Force Approach
        // for(int i=0;i<arr.length-1;i++){
        //     int mx = Integer.MIN_VALUE;
        //     for(int j=i+1;j<arr.length;j++){
        //         mx = Math.max(mx, arr[j]);
        //     }
        //     ans[i] = mx;
        // }
        // System.out.println("The greatest element on the right side of the array is: ");
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }


        //Method 2: Optimal Approach
        int nge = arr[arr.length-1];
        for(int i=n-2;i>=0;i--){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);

        }
        System.out.println("The greatest element on the right side of the array is: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        
    }
    
}
