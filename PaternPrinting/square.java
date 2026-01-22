// package PaternPrinting;

// import java.util.Scanner;

// public class square {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of column: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the number of rows: ");
//         int b = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<b;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



package PaternPrinting;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b;j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}