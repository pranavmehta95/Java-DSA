// import java.util.Scanner;
// public class multiplication_of_two_matrics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a[][] = {{1,2,1},{2,1,2}};
//         int b[][] = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
//         if(a[0].length!=b.length){
//             System.out.println("- Multiplication is not possible.");
//         }
//         else{ // multiplication is possible
//             int[][] c = new int[a.length][b[0].length];
//             for(int i=0;i<c.length;i++){
//                 for(int j=0;j<c[0].length;j++){
//                     // c[i][j] = a[i][0]*b[0][i] + a[i][1]*b[1][j]+a[i][2]*b[2][j]+....;
//                     for(int k=0;k<b.length;k++){
//                         c[i][j] += a[i][k]*b[k][j];
//                     }
//                     System.out.print(c[i][j]+" ");
//                 }
//                 System.out.println(" ");
//             }
//         }
//     }
// }



import java.util.Scanner;

public class multiplication_of_two_matrics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of matrix A
        System.out.print("Enter rows of matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of matrix A: ");
        int c1 = sc.nextInt();

        // Input size of matrix B
        System.out.print("Enter rows of matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of matrix B: ");
        int c2 = sc.nextInt();

        // Condition check
        if (c1 != r2) {
            System.out.println("Multiplication is not possible.");
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];

        // Input matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Result matrix
        int[][] c = new int[r1][c2];

        // Matrix multiplication (same logic)
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                for (int k = 0; k < r2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
