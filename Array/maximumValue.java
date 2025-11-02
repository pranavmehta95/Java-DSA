package array;
import java.util.Scanner;
public class maximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int mx = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        System.out.println(mx);
        
    }
    
}



// package array;
// import java.util.Scanner;
// public class maximumValue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.print(max);
        
//     }
    
// }