package Loops;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 3;
        for(int i=1;i<=n;i++){
            System.out.print(" "+a);
            a*=3;
        }
        // sc.close();
    }
}
    

