// package PaternPrinting;
// import java.util.*;
// public class FloydTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n; ");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i=0;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(a+" ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }


package PaternPrinting;
import java.util.*;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n; ");
        int n = sc.nextInt();
        int total = n * (n + 1) / 2; // total numbers
        int a = total;
        for (int i = n; i >= 1; i--) {
            int temp = a - i + 1;
            for (int j = temp; j <= a; j++) {
                System.out.print(j + " ");
            }
            a = temp - 1;
            System.out.println();
        }
    }
}

