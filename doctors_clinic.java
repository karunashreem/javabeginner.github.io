class Solution{
    static int waitingTime(int N, int X){
        // code here
         if(X>10){
           return 0;
       }else{
   return ((N - 1) * (10 - X));
  
       }
    }
}