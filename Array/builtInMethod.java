package Array;
import java.util.Arrays;
public class builtInMethod {
    public static void main(String[] args) {
        int[] arr = {23,43,54,53,24};
        for(int x:arr){                 //for each loop
            System.out.print(x+" ");
        }
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        Arrays.sort(arr);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
