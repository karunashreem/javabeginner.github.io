
class Solution{
    
  
    int maxTripletSum(int a[], int n)
    {
        // Complete the function
        Arrays.sort(a);
        int sum=a[n-1]+a[n-2]+a[n-3];
        return sum;
    }
  
    
}