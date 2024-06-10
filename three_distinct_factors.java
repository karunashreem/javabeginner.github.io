long l = (long)Math.sqrt(N);
        if(isPrime(l) && l*l == N)
            return 1;
        else
            return 0;
    }
    public static boolean isPrime(long n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if(n % 2 == 0)
            return false;
        
        for(int i = 3;i<=Math.sqrt(n);i+=2){
            if(n%i == 0)
                return false;
        }
    return true;