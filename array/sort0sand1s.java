// package array;

// public class sort0sand1s {
//     public static void main(String[] args) {
//         int[] arr = {0,0,0,0,1,0,1,1,0,1,1,0};
//         int n = arr.length;
//         int noOfZeros = 0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0) noOfZeros++;
//             // else noOfOnes++;
//         }
//         for(int i=0;i<n;i++){
//             if(i<noOfZeros) arr[i] = 0;
//             else arr[i] = 1;
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
    
// }



package array;

public class sort0sand1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,0,1,1,0,1,1,0};
        int n = arr.length;
        int i = 0, j = n - 1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                //swap
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        
        
        
    }
    
}
