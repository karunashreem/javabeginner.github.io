class Solution
{
    int isPowerOfFour(long n)
    {
	// Your code here	
	 int x = ((int)(n & (n-1)))>0 ? 0 :1;
   int y = ((int)(n & 0xAAAAAAAAL))>0 ? 0 :1;
   return x*y;
    }
}