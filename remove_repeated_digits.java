class Solution
{
    public long modify(long N)
    {
        //code here
        String s = Long.toString(N);
       
       String str = "";
       
       for(int i=0;i<s.length();i++){
           if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
               continue;
           }
           else{
               str += s.charAt(i);
           }
       }
       
    //   Convert String to long using .parseLong() function
       Long n = Long.parseLong(str);
       return n;
    }
}