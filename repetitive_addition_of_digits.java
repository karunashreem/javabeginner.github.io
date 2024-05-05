class Solution{
    static int singleDigit(long N){
        // code here
         int ans = (int)(1 + (N - 1) % 9);
        return ans;
    }
}