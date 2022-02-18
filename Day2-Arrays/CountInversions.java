public class Main {

    static int count = 0;
    public static int[] merge(int[]left,int[]right) {
        
        int i=0;
        int j=0;
        int k=0;
        int[]merged = new int[left.length + right.length];
        
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                merged[k] = left[i];
                k++;
                i++;
            }
            else {
                count += (left.length-i);
                merged[k] = right[j];
                k++;
                j++;
            }
        }
        
        while(i < left.length) {
           merged[k] = left[i];
           k++;
           i++; 
        }
        
        while(j < right.length) {
            merged[k] = right[j];
            k++;
            j++;
        }
        
        return merged;
    }

    public static int[] mergeSort(int arr[],int lo,int hi) {
        if(lo == hi) {
            int[]ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        
        int mid = (lo + hi)/2;
        
        int[]left = mergeSort(arr,lo,mid);
        int[]right = mergeSort(arr,mid+1,hi);
        
        int[]merged = merge(left,right);
        
        return merged;
    }

