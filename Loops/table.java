package Loops;
import java.util.Scanner;
public class table {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i=1; i<=10; i++){
    //         System.out.println(n+" * "+i+" = "+(n*i));
    //     }
    //     // sc.close();
    // }
   public static void main(String[] args) {
        // write your code logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i<=n*10;i+=n){
            System.out.print(" "+i);
        }
    }
}