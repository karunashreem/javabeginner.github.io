

class Solution
{
    long minDiff(long a[] ,int N,int K)
    {
        sort(arr, arr+N);
        vector<int> res;
        
        int p = 0;
        while(K<=N)
        {
            res.push_back(arr[K-1]-arr[p]);
            K++;
            p++;
        }
        
        sort(res.begin(), res.end());
        
        return res[0];
        
    }
}