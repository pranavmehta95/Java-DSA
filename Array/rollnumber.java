// package Array;
// import java.util.Scanner;
// public class rollnumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of students: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter marks of the students: ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("The roll number of students who has less than 35 marks: ");
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<35)
//             System.out.print(i+" ");
//         }
//     }
    
// }




package Array;
import java.util.Scanner;
public class rollnumber {
   public static void main(String[] args) {
		//Write your code here
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]<20) System.out.println(i+"\n");
    }
	}
    
}