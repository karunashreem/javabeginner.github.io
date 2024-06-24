class exercise12{

    // Write a function that calculates the Greatest Common Divisor of 2 numbers. 
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, b);
    }
    public static void main(String[] args) {
        //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the value for x:");
        // int x= sc.nextInt();
        // System.out.println("Enter the value for n:");
        // int n= sc.nextInt();
        // System.out.println("Value for x^n: "+ Math.pow(x,n));


        // Write a function that calculates the Greatest Common Divisor of 2 numbers. 
        System.out.println(gcd(1,2));


        
    }
}