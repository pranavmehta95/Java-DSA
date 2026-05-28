// package String;
// import java.util.Scanner;
// public class builtinstringmethod {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String p = "Pranav Mehta";
//         int a = p.length();
//         // System.out.println(p.charAt(0));
//         System.out.println(a);;
//     }
// }




//Input a syting and count all the vowels in the given string.
package String;
import java.util.Scanner;
public class builtinstringmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String x = sc.nextLine();
        int n = x.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = x.charAt(i);
            if(isVowel(ch)==true) count++;
        }
        System.out.println(count);
    }

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}
