// package TwoDimentionalArray;
import java.util.Scanner;
public class spiralform {
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
        // System.out.print(arr);
        System.out.println("Here os the Original matrix: ");
        print(arr);
        //Spiral form.
        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;
        
        while(minr<=maxr && minc<=maxc){
            //left to right
            for(int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            //top to bottom
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            //right to left
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;
            //bottom to top
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;


        }
    }
}
