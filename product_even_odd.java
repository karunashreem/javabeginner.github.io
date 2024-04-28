class Sol
{
    int EvenOdd(String n1 , String n2)
        {
            //code here.
        char ch1 = n1.charAt(n1.length() - 1);
            char ch2 = n2.charAt(n2.length() - 1);
            
            int pro = ch1 * ch2;
            
            if(pro % 2 == 0){
                return 1;
            }
            
            return 0;
        }
}