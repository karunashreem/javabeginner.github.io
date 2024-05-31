class Solution {
    static String canJump(Long N) {
        // code here
        if((N & (N-1) )== 0)
        return "True";
        
        else return "False";
    }
};