class Solution {
    static int[] checkDoorStatus(int N) {
        // code here
         int arr[] = new int[N];
      
        for(int i = 1;i <=N;i++)
        {
            if(i * i <= N)
            arr[i* i - 1] = 1;
            else
            {
                break;
            }
        }
        return arr;
    }
};