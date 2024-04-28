
class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        
        // Your code goes here
         ArrayList<Long> temp = new ArrayList<Long>();
        ArrayList<Long> finalList = new ArrayList<Long>();
        for(long a:arr)
            temp.add(a);
            
        Collections.sort(temp);
        int i;
        for(i=0;i<temp.size()/2;i++){
            finalList.add(temp.get(temp.size()-i-1));
            finalList.add(temp.get(i));
        }
        if(arr.length%2==1)
            finalList.add(temp.get(i));
            
        return finalList;
        
    }
}