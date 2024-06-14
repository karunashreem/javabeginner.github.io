class Solution {
    int countSubstringWithEqualEnds(String s) {
        // code here
        HashMap<Character,Integer> m = new HashMap<>();
       int ans=s.length();
       for(int i=0;i<s.length();i++){
           m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
           ans+=m.get(s.charAt(i))-1;
       }
       return ans;
    }
}