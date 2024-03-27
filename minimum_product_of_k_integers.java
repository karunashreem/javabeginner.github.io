class Solution{
    
    int minProduct(int arr[], int n,int k)
    {
        // Complete the function
        Arrays.sort(arr);
        long product =1;
        for(int i=0;i<k;i++)
        {
            product=(product*arr[i])%1000000007;
        }
        return (int)product;
    }   
}
