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
        int i = 0, j = size-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int l=0, m = steps-1;
        while(l<=m){
            int temp = arr[l];
            arr[l] = arr[m];
            arr[m] = temp;
            l++;
            m--;
        }
        for(int ele: arr){
             System.out.print(ele+" ");
         }
         System.out.println();
    }
    
}
