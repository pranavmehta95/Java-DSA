package Loops;

import java.util.Scanner;

public class howloopsworks {
    // public static void main(String[] args) {
    //     // Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     // int i;
    //     for(int i=1; i<=5; i++){
    //         System.out.println("hi pranav");
    //     }
        
    // }
    public static void main(String[] args) {
        // write your code logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }
    }
    
}
