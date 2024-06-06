
class Solution
{
    public Vector<Integer> solve(int n, int d)
    {
        //code here
        Vector <Integer> v= new Vector <> ();
        for(int i=0;i<=n;i++)
        {
            String s=Integer.toString(i);
            String find=Integer.toString(d);
            if(s.contains(find))
            {
                v.add(i);
            }
            
        }
        if(v.size()==0)
        {
            v.add(-1);
        }
        return v;
    }
}