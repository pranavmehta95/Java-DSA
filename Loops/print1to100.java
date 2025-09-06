// package Loops;

// public class print1to100 {
//     public static void main(String[] args) {
//         for(int i=1; i<=100; i++){
//             System.out.print(i+" ");
//         }
//     }
// }


package Loops;
import java.util.Scanner;
public class print1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        // sc.close();
    }
}