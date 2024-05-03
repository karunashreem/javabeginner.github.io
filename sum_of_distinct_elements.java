class Solution {
    int findSum(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int sum=arr[0];
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(arr[i]!=arr[j]){
                sum+=arr[j];
            }
        }
        return sum;
    }
}