package Basics;
import java.util.Scanner;
public class halfOfGivenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double d = (double) n;
        double half = d / 2;
        System.out.println("Half of the number is: " + half);
    }
    
}
