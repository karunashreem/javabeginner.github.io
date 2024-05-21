class Solution {
    static long leftShops(long i, long L){
        // code herelong ans=0;
        long ans=0;
        for(int j=1;j<=L;j++)
        {
            ans=((long)(Math.pow(2,j)))-i;
        }
        return ans;
        
    }
}