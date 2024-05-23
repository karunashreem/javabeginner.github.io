class Solution 
{ 
    String encryptString(String s) 
    {
        // code here
        StringBuilder sb = new StringBuilder();
        s = s+" ";
        char[]ch = s.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                sb.append(ch[i]);
                sb.append(String.valueOf(count+1));
                count=0;
            }else{
                ++count;
            }
        }
        return sb.reverse().toString();
    }
} 