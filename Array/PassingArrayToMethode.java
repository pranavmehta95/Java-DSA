package Array;
import java.util.Arrays;
public class PassingArrayToMethode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] x){
        x[0] = 10;
    }
    
}
