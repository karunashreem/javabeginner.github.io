class Complete{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> inversePermutation (int arr[], int n) {
        //Complete the function
        ArrayList<Integer> al = new ArrayList<>();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            int position = i;
            int element = arr[i];
            //al.add(element-1, position+1);
            a[element-1] = position+1;
        }
        for(int all:a) al.add(all);
        return al;
    }  
}