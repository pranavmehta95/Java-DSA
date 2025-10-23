package array;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,0,1,1,0,1,1,0,2,2,1,2,0,1,2};
        int n = arr.length;
        //Method 1: Counting Sort
        // int noOfZeros = 0, noOfOnes = 0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0) noOfZeros++;
        //     else if(arr[i]==1) noOfOnes++;
        // }
        // for(int i=0;i<n;i++){
        //     if(i<noOfZeros) arr[i] = 0;
        //     else if(i<noOfZeros+noOfOnes) arr[i] = 1;
        //     else arr[i] = 2;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // Method 2: Dutch National Flag Algorithm
        int mid = 0, hi = n-1, lo = 0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        
        
    }
    
}