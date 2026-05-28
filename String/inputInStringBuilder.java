package String;
import java.util.Scanner;
public class inputInStringBuilder {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // StringBuilder sb = new StringBuilder(s);
        // System.out.println(sb);




        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'a' );
        System.out.println(sb);
    }
}
