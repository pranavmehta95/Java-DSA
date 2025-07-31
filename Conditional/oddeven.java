// package Conditional;
// import java.util.Scanner;
// public class oddeven {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         if(n%2 == 0) System.out.println("Even");
//         if(n%2 != 0) System.out.println("Odd");

//     }
    
// }



package Conditional;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        int time = 22;
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 18) {
          System.out.println("Good day.");
        }  else {
          System.out.println("Good evening.");
        }
      }
    
}
