

class Solution
{
    public int[] prime_pairs(int n)
    {
        // Code here
        ArrayList<Integer> al = new ArrayList<>();
       for(int i = 2;i<=n/2;i++){
           if(isPrime(i)){
               for(int j = 2;j<=n/2;j++){
                   if(isPrime(j) && i*j <= n){
                    al.add(i);
                    al.add(j);
                   }
               }
           }
       }
       
       int [] ans = new int[al.size()];
       for(int i = 0;i<ans.length;i++){
           ans[i] = al.get(i);
       }
       
       return ans;
    }

    static boolean isPrime(int num){
        if (num < 2)
            return false;
        else if(num == 2)
            return true;
        else if(num % 2  == 0)
            return false;
            
        for(int i = 3;i<=Math.sqrt(num);i+=2){
            if(num % i == 0)
                return false;
        }
        
    return true;

    }
}