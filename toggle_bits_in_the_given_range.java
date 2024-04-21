class Solution {
    static int toggleBits(int n , int l , int r) {
        // code here
        int r1 =(int) Math.pow(2,r)-1 , l1 , m , ans;
        l1 =(int) Math.pow(2,l-1)-1;
        m = r1-l1;
        ans = n^m;
        return ans;
    }
};