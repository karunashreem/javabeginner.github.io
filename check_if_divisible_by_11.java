
class Sol
{
    int divisibleBy11 (String S)
    {
        // Your Code Here
        long num = (long)0;
        for(int i=0; i<S.length(); i++) {
            num = (num*10)+(S.charAt(i)-'0');
            num = num % 11;
        }
        return (int)num == 0 ? 1 : 0;
    }
}