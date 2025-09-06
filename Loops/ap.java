// package Loops;

// import java.util.Scanner;

// public class ap {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=2*n-1;i+=2){
//             System.out.print(" "+i);
//         }
//     }
// }



package Loops;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 4;
        for(int i=1;i<=n-1;i++){
            System.out.print(" "+a);
            a+=3;
        }
    }
}
