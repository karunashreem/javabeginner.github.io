class Solution {
    
    static pair maxNtype(long arr[], long n)
    {
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        int type=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
           }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        if(arr[0]==min && arr[arr.length-1]==max)
        {
            type=1;
        }
       else if(arr[0]==max && arr[arr.length-1]==min)
        {
            type=2;
        }
        else if(arr[0]<arr[arr.length-1]){
           type=3;
        }
        else if(arr[0]>arr[arr.length-1]){
           type=4;
        }
      return new pair(type,max);
    }
}



