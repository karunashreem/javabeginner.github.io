class Solution {
    int maxRepeating(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=-1;
        int res=-1;
        for(int i=0;i<k;i++){
            if(map.containsKey(i)){
                if(map.get(i)>max){
                    max=map.get(i);
                    res=i;
                }
            }
        }
        return res;
    }
}