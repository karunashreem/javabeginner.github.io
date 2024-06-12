class Solution{
    
    static int getCount(int arr[], int n, int num1, int num2) 
    { 
        // Complete the function
        int count = 0;
        int m = 0;
        int l = 0;
        
        for(int i=0; i < n; i++) {
            if(arr[i] == num1) {
                m = i + 1;
                break;
            }
        }
        
        for(int i= n - 1; i >= 0; i--) {
            if(arr[i] == num2) {
                l = i;
                break;
            }
        }
        
        for(int i=m; i < l; i++) {
            count++;
        }
        return count;
    }
}

