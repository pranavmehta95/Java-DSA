package array;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10};
        int m = a.length, n = b.length;
        int[] c = new int[a.length + b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
            if(i==a.length){
                while(j<b.length){
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }
            if(j==b.length){
                while(i<a.length){
                    c[k] = a[i];
                    i++;
                    k++;
                }
            }
        }
        for(int l=0;l<c.length;l++){
            System.out.print(c[l]+" ");
        }
    }
    
}
