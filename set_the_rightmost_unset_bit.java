class Solution{
    static int setBit(int N){
        // code here
        //If (N&(N+1))==0 means next number is 2 to the power. Hence this number has only 1's.
        //If it is !=0  in that case we can do the 'OR' operation on this number and one successor number.
        return (N&(N+1))!=0?(N|(N+1)):N;
    }
}