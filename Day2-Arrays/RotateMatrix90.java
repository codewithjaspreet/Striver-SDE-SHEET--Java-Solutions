 public class RotateMatrix90 {
        public void rotate(int[][] matrix) {
            
            Transpose(matrix);
            
            for(int i = 0 ; i<matrix.length  ; i++){
                 
                int l = 0 ; 
                int r = matrix[0].length -1;
                while(r>l){
                    
                    int val = matrix[i][l];
                    matrix[i][l] = matrix[i][r];
                    matrix[i][r]  = val;
                    l++;
                    r--;
                }    
            }
            
        }
        
        void Transpose(int[][] matrix){
            
            for(int i = 0 ; i<matrix.length ;i++){
                
                for(int j = i+1 ; j<matrix.length ; j++){
                    
                    swap(matrix , i , j);
                }
            }
        }
        
        void swap(int[][] matrix , int i  , int j){
            
            int s  = matrix[i][j];
            matrix[i][j] =    matrix[j][i];
             matrix[j][i] = s;
        }
        
        
       
 }
