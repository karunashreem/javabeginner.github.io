
class Solution {
    int isSame(String s) {
        // code here
         int size = s.length(),num=0,i=size-1,multi=1;
        
        while(Character.isDigit(s.charAt(i))){
                num=num+(s.charAt(i)-'0')*multi;
                i--;
                multi*=10;
        }

        if (++i == num)     return 1;
        return 0;
    }
}