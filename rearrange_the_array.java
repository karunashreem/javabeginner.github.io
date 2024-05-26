

class Solution {
    void rearrangeArray(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        int array[]=new int[n];
        int c=n-1;
        int d=0;
       for(int i=0;i < n;i++)
       {
           if(i%2==0)
           {
          array[i]=arr[d];
          d++;
           }
           else
           {
               array[i]=arr[c];
               c--;
           }
       }
       for(int i=0;i < n;i++)
       {
           arr[i]=array[i];
       }
    }
}
