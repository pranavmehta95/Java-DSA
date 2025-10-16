package array;
import java.util.ArrayList;
public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); // add element at index 0
        arr.add(1,20); // add element at index 1
        arr.add(2,30); // add element at index 2
        arr.add(3,40); // add element at index 3
        arr.add(4,50); // add element at index 4
        arr.add(5,60); // add element at index 5
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" "); // get element at index i
        }
        System.out.println();
        arr.set(2,100); // set element at index 2 to 100
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" "); // get element at index i 
        }
        arr.add(90);
        System.out.println();
        System.out.println(arr.size()); // size of arraylist
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" "); // get element at index i 
        }
        
    }
    
}
