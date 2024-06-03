
class Solution
{
    public double[]  FindRoots(int A, int B, int C)
    {
        // code here
        double r = (B*B) - (4*A*C);
        
        if(r < 0){
            return new double[]{-1d};
        }
        
        double squareRoot = Math.sqrt(r);
        double x1 = ((-1*B) + squareRoot)/(2*A);
        double x2 = ((-1*B) - squareRoot)/(2*A);
        
        double[] root = new double[2];
        if(x1 > x2){
            root[0] = x2;
            root[1] = x1;
        } else{
            root[1] = x2;
            root[0] = x1;
        }
        return root;
    }
}