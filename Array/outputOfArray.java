package array;
import java.util.Scanner;
public class outputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // int[] arr=new int[5];
        // arr[0]=97;
        // arr[1]=98;
        // arr[2]=99;
        // arr[3]=100;
        // arr[4]=101;
        System.out.println("The elements of array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
        
    
}