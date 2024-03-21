
class Sol
{
    int getCount (String S, int N)
    {
        // your code here
         int count=0;
        int n=S.length();
        Map<Character, Integer> ans = new HashMap<>();
        ans.put(S.charAt(0),1);
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                if(ans.containsKey(S.charAt(i))) ans.put(S.charAt(i), ans.get(S.charAt(i))+1);
                else ans.put(S.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : ans.entrySet()) {
            Integer value = entry.getValue();
            if(value==N) count++;
        }
        return count;
    }
}