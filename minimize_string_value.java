
class Solution {
    int minValue(String S,int K) {
        // code here
        if(K>S.length()){
            return 0;
        }
        int[] arr=new int[26];
        for(int i=0;i<S.length();i++){
            arr[S.charAt(i)-'a']++;
        }
        
        for(int j=0;j<K;j++){
            int max=0;
            int m=0;
         for(int i=0;i<26;i++){
            if(arr[i]>max && arr[i]>0){
                max=arr[i];
                m=i;
            }
        }
        arr[m]=arr[m]-1;
        }
        int ans=0;
        for(int j=0;j<26;j++){
            ans=ans+(int)Math.pow(arr[j],2);
        }
        return ans;
    }
}