package Operations;

public class GCDLCD {
public static int gcd(int a, int b) {
       
      
        if (b == 0)
            return a;
        
   
        else
            return gcd(b, a % b);
    }

public static int lcm(int a, int b, int gcdValue)
{
    return Math.abs(a * b) / gcdValue;
}

}
