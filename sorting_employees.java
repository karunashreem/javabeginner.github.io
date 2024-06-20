
class Solution
{
    void sortRecords(node arr[],int n)
    {
        // Your code goes here
        Arrays.sort(arr, Comparator.comparing((node node1) -> node1.salary)
                .thenComparing((node node1) -> node1.name));
    }
}
