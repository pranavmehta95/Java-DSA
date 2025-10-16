package array;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int x = sc.nextInt();
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Soution
        boolean flag = false;  //false means element not found
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag = true;  //true means element found
                break;
            }
        }
        if(flag==true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }

    }
    
}
