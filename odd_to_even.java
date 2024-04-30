class Solution
{
    public String makeEven(String s)
    {
        //code here.
        StringBuilder sb = new StringBuilder(s);
        
        boolean flag = true;
        int index = -1;
        int len = s.length();
        char last = s.charAt(len-1);
        
        // If last digit is greater than any of even digit (from left to right) then swap
        for(int i=0; i < len - 1; i++){
            char ch = s.charAt(i);
            
            if(ch % 2 == 0){
              index = i;
              if(last > ch){
                  sb.setCharAt(i, last);
                  sb.setCharAt(len-1, ch);
                  flag = false;
                  break;
              }
            }
        }
        
        // Otherwise, swap last even digit with last digit.
        if(flag){
            if(index != -1){
                char ch = s.charAt(index);
                sb.setCharAt(index, last);
                sb.setCharAt(len-1, ch);
            }
        }
        
        return sb.toString();
    }
}