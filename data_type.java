class Solution {
    static int dataTypeSize(String str) {
        // code here
        char ch=str.charAt(0);
        if(ch=='C') return 1;
        else if(ch=='I') return 4;
        else if(ch=='L') return 8;
        else if(ch=='F') return 4;
        else return 8;
    }
}