// package Array;
// import java.util.Scanner;
// public class sumofelement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array: ");
//         int size=sc.nextInt();
//         int arr[] = new int[size];
//         System.out.println("Enter the elements of array: ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println("The sum of elements in array is: "+sum);
//     }
    
// }



package Array;
import java.util.Scanner;
public class sumofelement {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        System.out.println("The product of elements in array is: "+product);
    }
    
}