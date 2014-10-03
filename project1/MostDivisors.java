package project1;

public class MostDivisors {
	//Part 3: Number with MostDivisors
	//Note: As per the instructions, make sure this class is instantiable 
	private int input;
	
	public MostDivisors(int input) {
		setN(input);
	}
	
	public void setN(int input)
	{
		if(input > 0)
		{
			this.input = input;
		}
		
		else
		{
			System.out.println("Invalid Input: Must be positive");
		}
	}
	
	// returns the lowest integer with the most divisors based on initial input
	public int getMost()
	{
		return getMost(input);
	}
	
	// returns the lowest integer with the most divisors
	public int getMost(int x) {
		int most = 1;
		
		for (int i = 1; i <= x; i++)
		{
			if(getDivisors(most).length() < getDivisors(i).length())
			{
				most = i;
			}
		}
		
		return most;
	}
	
	// returns divisors of lowest value with the greatest quantity
	public String getDivisors() {
		return getDivisors(getMost());
	}
	
	// returns divisors of value n
	public String getDivisors(int n)
	{
		String divisors = "";
		
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				divisors += i + " ";
			}
		}
		
		return divisors;
	}
	
	public static void main(String args[])
	{
	}
}
