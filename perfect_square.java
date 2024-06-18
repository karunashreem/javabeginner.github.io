class Solution{
    static int checkPerfectSquare(int N){
        // code here
        int i = 1;
        
        while (N > 0) {
            N = N - i;
            i = i + 2;
        }
        
        return N == 0 ? 1 : 0;
    }
}