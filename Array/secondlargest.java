package Array;
import java.util.Scanner;

// import Loops.countdigit;
public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }   
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i] >smax){
                smax=arr[i];
            
            }
            
        }
        System.out.println("Maximum element is: "+max);
        System.out.println("Second maximum is: "+smax);
    }
    
}
