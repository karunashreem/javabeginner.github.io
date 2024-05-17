class Solution {
    static long nthEvenFibonacci(long n){
        // code here
         long N=3*n;
       return solution(N);
   }
   public static long solution(long N)
   {
       long a=1,b=0,c=0;
       for(long i=1;i<=N;i++)
         {
             c=(a+b)%1000000007;
             a=b;
             b=c;
         }
         
         return b%1000000007 ;
    }
}