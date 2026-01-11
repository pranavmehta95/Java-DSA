import java.util.Scanner;
public class setmatrixzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of column: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Original Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] helper = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                helper[i][j] = arr[i][j];
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper[i][j]==0){
                    //set ith row and jth column to 0 in arr
                    for(int b=0;b<n;b++){
                        arr[i][b] = 0;                    
                    }
                    for(int a=0;a<m;a++){
                        arr[a][j] = 0;
                    }
                }
            }
        }

        System.out.println("Here is the matrix: 3");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}




//2nd  METHOD WHICH IS MORE EFFICIENT
// class Solution {
//     public void setZeroes(int[][] arr) {
//         int m = arr.length, n = arr[0].length;
//         boolean[] row = new boolean[m];
//         boolean[] col = new boolean[n]; 
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(arr[i][j]==0){
//                     row[i] = true;
//                     col[j] = true;
//                 }
//             }
//         }
        
//         for(int i=0;i<m;i++){
//             if(row[i]==true){
//                 for(int j=0;j<n;j++){
//                     arr[i][j]=0;
//                 }
//             }
//         }


//         for(int j=0;j<n;j++){
//             if(col[j]==true){
//                 for(int i=0;i<m;i++){
//                     arr[i][j] = 0;
//                 }
//             }
//         }
        

//     }
// }