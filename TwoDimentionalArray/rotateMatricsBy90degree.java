// package TwoDimentionalArray;
import java.util.Scanner;
public class rotateMatricsBy90degree {
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
        int n = arr.length, m = arr[0].length;
        for (int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here os the Original Array: ");
        print(arr);
        //Now I have to transpose the matrics
        int transpose[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Here is the transposed array: ");
        print(transpose);
        //Now the final part is reversing the matrics
        for(int i=0;i<m;i++){
            int x = 0, y = n-1;
            while(x<y){
                int temp = transpose[i][x];
                transpose[i][x] = transpose[i][y];
                transpose[i][y] = temp;
                x++;
                y--;
            }
        }
        System.out.println("Here is the reversed matrics:");
        print(transpose);
    }
}
