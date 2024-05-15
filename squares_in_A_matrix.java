class Solution {
    static long squaresInMatrix(int m, int n) {
        // code here
         long ans = 0;
        while(m > 0 && n > 0){
            int prod = m * n;
            m--;
            n--;
            ans += prod;
        }
        return ans;
    }
};