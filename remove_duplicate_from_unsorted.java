class Solution {
    
    public int[] removeDuplicate(int A[], int N)
    {
       LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<N;i++){
            set.add(A[i]);
        }
        int[] arr=new int[set.size()];
        int i=0;
        for(int value:set){
            arr[i]=value;
            i++;
        }
        return arr; 
    }
}