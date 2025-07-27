// package Basics;
// import java.util.Scanner;
// public class takinginput {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.println(n*n);

//     }
// }


package Basics;
import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int m = sc.nextInt();
        int j = n + m;
        System.out.println("Sum is : "+j);

    }
}
