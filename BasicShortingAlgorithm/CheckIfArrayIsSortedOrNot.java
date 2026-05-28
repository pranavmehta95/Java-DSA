package BasicShortingAlgorithm;

public class CheckIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        boolean flag = true; // true menas sorted
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
                flag = false; // false -> unsorted
                break;
            }
        }
        if(flag == true){
            System.out.println("Sorted");
        }
        else System.out.println("Unsorted");
    }
}
