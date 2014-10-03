package project1;

public class PrimeTest
{
	public static void main(String args[])
	{
		PrimeInst p1 = new PrimeInst();
		PrimeInst p2 = new PrimeInst();
		
		// Reset p2 to 100
		p2.reset(100);
		// Reset p1 to 2
		p1.reset();
		
		System.out.printf("P1: %d\n", p1.getPrime());
		System.out.printf("P2: %d\n", p2.getPrime());
	}
}
