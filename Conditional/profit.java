package Conditional;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.print("Profit"); 
        }
        if(sp<cp){
            System.out.print("No Profit");
        }
        if(sp==cp){
            System.out.print("No Profit No Loss");
        }
        
    }
    
}
