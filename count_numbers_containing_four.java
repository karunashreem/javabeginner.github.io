class Solution {
    static int countNumberswith4(int N) {
        // code here
        int count=0;
        for(int i=1;i<=N;i++)
        {
            String s=Integer.toString(i);
            if(s.contains("4"))
            count++;
        }
        return count;
    }
};