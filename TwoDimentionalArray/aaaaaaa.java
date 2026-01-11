import java.util.Scanner;
public class aaaaaaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("Enter the elements of the matrics: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }        
        }
        System.out.println("Here is the matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            } 
            System.out.println( );       
        }
    }
}