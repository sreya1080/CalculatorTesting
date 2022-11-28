package Operations;

public class isPrime {
	 // Check for number prime or not
    public static boolean isPrimeNumber(int n)
    {
 
     
        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
       
        else if (n % 2 == 0)
            return false;
 

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
 

}
