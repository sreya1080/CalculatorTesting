package Operations;

public class Factorial {
	public long calculateFactorial(int n)
	{
		long mul=1;
		if(n<0)
			return -1;
		if(n>10)
			return 99999;
		else
		{
			for(int i=1;i<=n;i++)
			{
				mul=mul*i;
			}
			return mul;
		}
	}
}
