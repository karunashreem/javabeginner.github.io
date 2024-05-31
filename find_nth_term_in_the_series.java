class Solution {
    static long nthOfSeries(long n){
        // code here
        int s = 9;
        int k = 24;
        
        for(int i = 2;i<=n;i++){
            s = s+k;
            k = k+16;
        }
        
        return s;
    }
}