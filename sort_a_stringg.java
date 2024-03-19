class Solution 
{ 
    String sort(String s) 
    {
        // code here
        char tempArray1[] = s.toCharArray();
        Arrays.sort(tempArray1);
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < tempArray1.length; i++) {
            sb.append(tempArray1[i]);
        }
 
        return sb.toString();
    }
} 