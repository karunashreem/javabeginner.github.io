
class GfG
{
    public static ArrayList<Integer> findTriplet(int arr[], int n)
    {
        // your code here
        ArrayList<Integer>list = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=n-1;i>=2;i--){
            int j=0;
            int k=i-1;
            
            while(j<k){
                if(arr[i]==(arr[j]+arr[k])){
                    list.add(arr[j]);
                    list.add(arr[k]);
                    list.add(arr[i]);
                    return list;
                }
                else if(arr[i]>(arr[j]+arr[k])){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return list;
    }
}