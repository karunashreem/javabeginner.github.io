class Compute {
    public int[] pendulumArrangement(int arr[], int n) {
        // Write your code here
        Arrays.sort(arr);
        int arr2[] = new int[n];
        int i;
        
        if(n%2==0) {
            arr2[n/2-1] = arr[0];
            i = n/2-1;
        }
        else {
            i=n/2;
            arr2[n/2] = arr[0];
        }
        
        int j = 1;
        int k = 1;
        for(int count=0 ; count<n ; count++) {
            if(j%2!=0) {
                i=i+j;
                if(i<n)
                    arr2[i] = arr[k];
                k++;
                j++;
            }
            else {
                i=i-j;
                if(i>=0)
                    arr2[i] = arr[k];
                k++;
                j++;
            }
        }
        return arr2;
    }
}