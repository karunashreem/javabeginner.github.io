
class Solution
{
    public long sumofproduct(int n)
    {
        // code here
        long sum = 0;
        for(int y = 1;y<=n;y++){
            int x = n/y;
            sum += (long) x*y;
        }
        
    return sum;
    }
}