
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int check (int arr[], int[] brr, int n) {
        //Complete the function
        int count=0;
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++) {
            if(arr[i]==brr[i]) count++;
        }
        if(count==n) return 1;
        else return 0;
        
    }
    
    
}