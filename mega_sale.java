class Compute {

    public static long maxProfit(int a[], int n, int m) {
        // Your code goes here 
        Arrays.sort(a);
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0 && m>0)
            {
                sum+=Math.abs(a[i]);
                m--;
            }
        }
        return sum;
    }
}