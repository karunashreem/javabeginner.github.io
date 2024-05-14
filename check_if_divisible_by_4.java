class Sol
{
    int divisibleBy4 (String N)
    {
        // Your Code Here
        if(N.length()==1){
            return (N.charAt(0)-'0')%4==0?1:0;
        }
        int num=Integer.parseInt(N.substring(N.length()-2));
        return num%4==0?1:0;
        
    }
}