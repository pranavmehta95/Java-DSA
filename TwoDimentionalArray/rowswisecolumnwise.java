// package TwoDimentionalArray;
// // import java.util.Scanner;
// public class rowswisecolumnwise {
//     public static void main(String[] args) {
//         int[][] arr = {{12,32,32,34},{26,87,64,36},{10,20,30,40}};
//         int m = arr.length, n=arr[0].length;
//         // for (int i = 0; i < m; i++) {
//         //     for(int j=0;j<n;j++){
//         //         System.out.print(arr[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         //columnwise printing
//         for (int j = 0; j < n; j++) {
//             for(int i=0;i<m;i++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
    
// }



// package TwoDimentionalArray;
// import java.util.Scanner;
public class rowswisecolumnwise {
    public static void main(String[] args) {
        int[][] arr = {{12,32,32,34},{26,87,64,36},{10,20,30,40}};
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for(int j = 0;j<n ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}