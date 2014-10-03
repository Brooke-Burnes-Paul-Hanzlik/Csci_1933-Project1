package project1;

public class Prime {
  //Part 2: Primes
  //Place your methods in here 
	
	private static int prevPrime = 2;
	
	public static boolean isPrime(int p) {
		//0 and negative numbers are not prime
		if (p <= 0) {
			return false;
		}
		//1 is not prime
		if (p == 1) {
			return false;
		}
		//Checks for even numbers
		if (p % 2 == 0) {
			return false;
		}
		//Checks for odd numbers
		for (int i = 3; i*i <= p; i += 2) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getPrime() 
	{
		int i = prevPrime;
		while(!isPrime(i));
		{
			i+=2;
		}
		reset(i);
		return i;
	}
	
	public static void reset()
	{
		reset(2);
	}
	
	public static void reset(int n)
	{
		prevPrime = n;
	}
}
