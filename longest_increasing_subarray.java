
class Solution {
    
    public long lenOfLongIncSubArr(long arr[], long n)
    {
        long max_len = 1;
        long len = 1;
        
        for(int i = 1;i<n;i++){
            if(arr[i]>arr[i-1]){
                len ++;
            }
            
            else{
                len = 1;
            }
            
            if(len>max_len){
                max_len = len;
            }
        }
        
        return max_len;
    }
}