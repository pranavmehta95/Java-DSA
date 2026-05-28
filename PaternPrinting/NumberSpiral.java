package PaternPrinting;
import java.util.*;
public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(Math.min(i, j)+" ");
            }
            System.out.println();
            
        }
    }
}
