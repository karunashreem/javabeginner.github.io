class Solution{
    static String checkFibonacci(int N){
        // code here
          int a = 0 ; int b = 1;
        int rahee[] = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            int c = a + b;
            rahee[i] = c;
             a = b;
             b = c;
        }
        for(int i = 0 ; i < N ; i++)
        {
            if(rahee[i] == N)
            return "Yes";
            
            
        }
        return "No";
    }
}
