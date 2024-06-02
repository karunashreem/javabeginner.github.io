


class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        // Initialize an empty list to store the resulting elements
        ArrayList<Integer> list = new ArrayList<>();
        
        // Variable to keep track of cumulative XOR operations
        int xorTillNow = 0;
        
        // Process the queries in reverse order
        for (int i = q - 1; i >= 0; i--) {
            // If the query is of type 1, update the cumulative XOR value
            if (queries[i][0] == 1) {
                xorTillNow ^= queries[i][1];
            } else {
                // If the query is of type 0, insert the value XORed with the cumulative XOR value into the list
                list.add(queries[i][1] ^ xorTillNow);
            }
        }
        
        // Add the cumulative XOR value to the list as the final element
        list.add(xorTillNow);
        
        // Sort the list to get the final sorted order
        Collections.sort(list);
        
        // Return the sorted list
        return list;
    }
}