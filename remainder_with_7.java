class Solution
{
    // Complete the function
    int remainderWith7(String num)
    {
        // Your code here
        int rem = 0;
        for(int i=0;i<num.length();i++)
        {
            int digit = num.charAt(i)-'0';
            rem = (rem*10+digit)%7;
        }
        return rem;
    }
}
