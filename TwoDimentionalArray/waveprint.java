// 




// package TwoDimentionalArray;
// import java.util.Scanner;
// public class waveprint {
//     public static void print(int[][] arr){
//         for (int i=0;i<arr.length;i++) {
//             for(int j=0;j<arr[0].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the number of column: ");
//         int b = sc.nextInt();
//         System.out.println("Enter the elements of the array: ");
//         int[][] arr = new int[a][b];
//         int m = arr.length, n = arr[0].length;
//         for (int i=0;i<m;i++) {
//             for(int j=0;j<n;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Here os the Original matrix: ");
//         print(arr);
//         for(int i=0;i<m;i++){
//             if(i%2==0){
//                 for(int j=0;j<n;j++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//             else{
//                 for(int j=n-1;j>=0;j--){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//         }
//     }
// }



// package TwoDimentionalArray;
import java.util.Scanner;
public class waveprint {
    public static void print(int[][] arr){
        for (int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int b = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[][] arr = new int[a][b];
        int m = arr.length, n = arr[0].length;
        for (int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here os the Original matrix: ");
        print(arr);
        for(int i=n-1;i>=0;i--){
            if(i%2==0){
                for(int j = 0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        
        // else{

        // }
        
    }
}
