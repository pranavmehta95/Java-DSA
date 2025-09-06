package Conditional;

import java.util.Scanner;

public class threeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n>=100 && n<=999){
            System.out.print("It's a three digit number.");
        }
        else{
            System.out.print("It's not a three digit number.");
        }
    }
    
}