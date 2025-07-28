package Basics;
import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charater : ");
        char ch = sc.next().charAt(0);
        int x = (int)ch;
        System.out.println(x);
    }

    
}
