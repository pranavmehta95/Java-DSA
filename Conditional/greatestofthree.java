package Conditional;

import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();   
        if(a>=b && a>=c){
            System.out.print(a+" is greatest.");
        }
        else if(b>=a && b>=c){
            System.out.print(b+" is greatest.");
        }
        else if(c>=a && c>=b){
            System.out.print(c+" is greatest.");
        }
        else{
            System.out.print("All are equal.");
        }
    }
    
}
