package Conditional;

import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter second number : ");
        int m = sc.nextInt();
        System.out.print("Enter third number : ");
        int o = sc.nextInt();
        if(n>=m){
            if(n>=o){
                System.out.print(n+" is greatest.");
            }
            else{
                System.out.print(o+" is greatest.");
            }
        }
        else{
            if(m>=o){
                System.out.print(m+" is greatest.");
            }
            else{
                System.out.print(o+" is greatest.");
            }
        }
    }
    
}
