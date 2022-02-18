//  slight variation of count inversion : using merge sort onlogn time & o(N) space

public class Solution {
    int Rp=0;
    
    void merge(int [] res,int [] A,int B[])
    {
        int n = A.length;
        int m = B.length;
  
 
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m)
        {
            if((long)A[i]>2*(long)B[j])
            {
                j++;
                Rp = Rp+(n-i);
                
            }
            else
                i++;
        }
        i= 0;j=0;
        while(i<n&&j<m)
        {
        
            if(A[i]<=B[j])
                res[k++] = A[i++];
            else
                {
                res[k++] = B[j++];
                }
        }
        while(i<n)
            res[k++] = A[i++];
        while(j<m)
            res[k++] = B[j++];

        
    }
    void mergeSort(int [] A)
    {
        
        int n = A.length;
        if(n<2)
        {
            return;
        }
        int mid = n/2;
        int n1 = mid;
        int n2 = n-mid;
        int [] left = new int [n1];
        int [] right = new int [n2];
        for(int i = 0;i<n1;i++)
            left[i] = A[i];
        int j = 0;
        for(int i = (int)mid;i<n;i++)
            right[j++] = A[i];
        mergeSort(right);
        mergeSort(left);
        merge(A,left,right);
    }
    public int reversePairs(int[] A) {
        
        mergeSort(A);

        return Rp;
    }
}
