    
    // https://youtu.be/_FkR5zMwHQ0 - >  solution video

    // technique : sort on starting point ,  - > tackle on starting point for cases
    // partial and complete overalapping  , and no overalap
    
    
    import java.util.*;
    class MergeIntervals {
        public int[][] merge(int[][] intervals) {
            
            //  sorted on the basis of starting index
           Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));   
            
           ArrayList<int[]> list = new ArrayList<>();
            
           for(int[] interval : intervals){
               
               if(list.size() == 0){
                   list.add(interval);
               }
               else{
                   int prevInterval[] = list.get(list.size() - 1);
                   
                   if(interval[0] <= prevInterval[1]) {   // overlapping {
                       prevInterval[1] = Math.max(prevInterval[1] , interval[1]);
                   }
               
                   else {
                       list.add(interval);
                   }
           
           }
           }
            
            // return arraylist as 2-d array
           return list.toArray(new int[list.size()][]);
             
            
            
           }
        
        }
     
