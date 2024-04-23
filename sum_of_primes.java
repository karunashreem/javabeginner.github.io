
class Solution{
    static int primeSum(int N){
        // code here
        int sum=0;
        while(N!=0){
            int temp = N%10;
            if(temp==2 || temp==3 || temp==5 || temp==7)
                sum+=temp;
            N/=10;
        }
        return sum;
    }
}