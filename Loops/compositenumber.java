package Loops;

// import java.util.Scanner;

// public class compositenumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 System.out.println("Composite Number");
//                 break;
//             }
//         }
//     }
// }



// package Loops;

// import java.util.Scanner;

// public class compositenumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         int x = 0;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 System.out.println("Composite Number");
//                 x = 1;  // 1 means composite.
//                 break;
//             }
//         }
//         if(n==1) System.out.println("Nother composite number nor prime number");
//         else if(x==0){
//             System.out.println("Prime number.");
//         }
//     }
// }




import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isComposite = false;

        if (n > 1) {   // Only check for numbers greater than 1
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }

        if (isComposite) {
            System.out.println("True");   // Composite number
        } else {
            System.out.println("False");  // Prime or <= 1
        }

        sc.close();
    }
}