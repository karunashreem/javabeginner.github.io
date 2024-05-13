class Complete{
    
   
    // Function for finding maximum and value pair
    public static long sum (int arr[], int n) {
        HashMap<Integer, Integer> cnt = new HashMap<>();

        long ans = 0, pre_sum = 0;
        for (int i = 0; i < n; i++) {
            ans += (i * arr[i]) - pre_sum;
            pre_sum += arr[i];
    
            if (cnt.containsKey(arr[i] - 1))
                ans -= cnt.get(arr[i] - 1);
    
            if (cnt.containsKey(arr[i] + 1))
                ans += cnt.get(arr[i] + 1);
    
            cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
        }
        return ans;
    }
}