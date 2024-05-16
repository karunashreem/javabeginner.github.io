
class Solution
{
    long minDiff(long a[] ,int N,int K)
    {
        Arrays.sort(a);
        
        long result=Integer.MAX_VALUE;
        int j=0;
        for(int i=K-1; i<N; i++){
            result=Math.min(result,a[i]-a[j]);
            j++;
        }
        return result;
        
    }
}