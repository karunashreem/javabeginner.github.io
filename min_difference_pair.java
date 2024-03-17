
class Solution
{
    public int minimum_difference(int[] nums)
    {
        // code here
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int currMin=nums[i+1]-nums[i];
            min=Math.min(min,currMin);   
        }
        return min;
    }
}