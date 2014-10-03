package project1;

public class Prime {
  //Part 2: Primes
  //Place your methods in here 
	
	private static int prevPrime = 2;
	
	// Determine if a value is prime
	public static boolean isPrime(int p) {
		//0 and negative numbers are not prime
		if (p <= 0) {
			return false;
		}
		//1 is not prime
		if (p == 1) {
			return false;
		}
		if (p == 2) {
			return true;
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
	
	// Returned stored prime
	// Set prevPrime to next available prime
	public static int getPrime() 
	{
		int i = prevPrime;
		reset(i+1);
		return i;
	}
	
	// Reset prevPrime to first prime number
	public static void reset()
	{
		reset(2);
	}
	
	// Set prevPrime to first prime >= n
	public static void reset(int n)
	{
		while(!isPrime(n))
		{
			n++;
		}
		prevPrime = n;
	}
	
	// sums the first n primes, include stored vlaue
	public static int addPrime(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += getPrime();
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		System.out.println(Prime.addPrime(2)); // 2 + 3 = 5
		System.out.println(Prime.getPrime()); // cout 5, prevPrime = 7
		Prime.reset();
		System.out.println(Prime.getPrime()); // cout 2, prevPrime = 3
		Prime.reset(4);
		System.out.println(Prime.getPrime()); // cout 5
		Prime.reset(5);
		System.out.println(Prime.getPrime()); // cout 5
	}
}
