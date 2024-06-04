class Solution 
{ 
    int findLength(String s) 
    { 
        // code here
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}