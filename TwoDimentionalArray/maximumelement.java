// package TwoDimentionalArray;
// import java.util.Scanner;
// public class maximumelement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int m = sc.nextInt();
//         System.out.print("Enter the number of column: ");
//         int n = sc.nextInt();
//         int arr[][] = new int[m][n];
//         System.out.println("Enter the elements of the array: ");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         // int mx = arr[0][0];
//         // for(int i=0;i<m;i++){
//         //     for(int j=0;j<n;j++){
//         //         if(arr[i][j]>mx){
//         //             mx = arr[i][j];
//         //         }
//         //     }
//         // }


//         int mx = Integer.MIN_VALUE;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 mx = Math.max(mx,arr[i][j]);
//             }
//         }



//         System.out.println(mx);



//     }
    
// }




// package TwoDimentionalArray;
// import java.util.Scanner;
// public class maximumelement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int m = sc.nextInt();
//         System.out.print("Enter the number of column: ");
//         int n = sc.nextInt();
//         int arr[][] = new int[m][n];
//         System.out.println("Enter the elements of the array: ");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int mn = arr[0][0];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(arr[i][j]<mn){
//                     mn = arr[i][j];
//                 }
//             }
//         }        
//         System.out.println(mn);



//     }
    
// }





// package TwoDimentionalArray;
import java.util.Scanner;
public class maximumelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];
        int arr3[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr3[i][j]+" ");
            }
        }


    }
    
}