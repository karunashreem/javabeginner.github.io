class Geeks
{
    public static void SumArray(int arr[], int n)
    {
        // your code here
        int sum=0;
        for(int i=0;i<n;i++) sum+=arr[i];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sum-arr[i];
        }
    }
}
