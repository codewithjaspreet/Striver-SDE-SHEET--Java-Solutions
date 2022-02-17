//  logarathmic time complexity & space 
// Recursive code - give TLE for bigger values
// optimised memoization & dp solution to be done 

class Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        return count(0 , 0 , m , n);
    }
    
    long count(int i , int j , int m , int n){
        
        if(i>=m || j>=n ) return 0;
        if(i == m - 1 && j == n - 1) return 1;
        
        else return count(i+1 , j , m ,n ) + count(i , j + 1 , m , n);
    }
}