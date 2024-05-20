class Solution{

    static ArrayList<Integer> uniqueNumbers(int L,int R){
        // code here
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int i,temp;
        boolean choice=true;
        for(i=L;i<=R;i++){
            int num[]=new int[10];
            temp=i;
            choice=true;
            while(temp>0){
                int rem=temp%10;
                num[rem]++;
                if(num[rem]>1){
                    choice=false;
                    break;
                }
                temp/=10;
            }
            
            if(choice)
                ar.add(i);
        }
        return ar;
    }
}