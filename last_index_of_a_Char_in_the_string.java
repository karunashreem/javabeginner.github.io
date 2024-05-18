class Solution{
    int LastIndex(String s, char p){
        // code here
        char[] arr=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(arr[i]==p)
            {
                return i;
            }
        }
        return -1;
    }
}
