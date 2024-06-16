

class Solution {
    long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        // code here
         ArrayList<Long> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] < k){
                if(checkAdjacentDiff(arr[i])){
                    result.add(arr[i]);
                }
            }
        }
        
        
        long ans[] = new long[result.size()];
        
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        
        return ans;
    }
    
    boolean checkAdjacentDiff(long a){
        ArrayList<Long> v = new ArrayList<>();
        while(a>0){
            long d = a%10;
            v.add(d);
            a = a/10;
        }
        
        if(v.size() ==1 ){
            return false;
        }
        
        for(int i=0; i<v.size()-1; i++){
            if(Math.abs(v.get(i)-v.get(i+1)) != 1)
                return false;
        }
        return true;
        }
    }

