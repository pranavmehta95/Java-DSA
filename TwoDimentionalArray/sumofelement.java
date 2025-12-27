// package TwoDimentionalArray;
// import java.util.Scanner;
// public class sumofelement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of the rows: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the number of column: ");
//         int m = sc.nextInt();
//         int arr[][] = new int[m][n];
//         System.out.println("Enter the elements of the array: ");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int sum = 0;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 sum += arr[i][j];
//             }
//         }
//         System.out.println(sum);

//     }
    
// }


// package TwoDimentionalArray;
import java.util.Scanner;
public class sumofelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum += arr[i][j];
            }
        }
        System.out.print(sum);

    }
    
}