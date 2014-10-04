package project1;

public class RomanNumeral {
	//Part 1: Roman Numeral
	private static String UNDEFINED = "-100";
	private int integerValue;
	// Maximum number that can be calculated
	private static int max = 2500;
	// Minimum number that can be calculated
	private static int min = 0;
	
	private static String[] romans =	{
						"I", "IV", "V", "IX", "X",
						"XL", "L", "XC", "C",
						"CD", "D", "CM", "M"
						};
	private static int[] rvals =	{
					1, 4, 5, 9, 10,
					40, 50, 90, 100,
					400, 500, 900, 1000
					};
	
	public RomanNumeral(int integerValue)
	{
		setIntegerValue(integerValue);
	}
	
	// Reports if invalid integer is entered, but still stores the number
	public void setIntegerValue(int integerValue)
	{
		if(integerValue > max || integerValue < min)
		{
			System.out.println("Error: Invalid input\n");
		}
		this.integerValue = integerValue;
	}
	
	// Generates roman numeral representation of integerValue if possible
	// Else returns UNDEFINEDs static value
	public String toString()
	{
		String tmp = "";
		
		if(integerValue >= min || integerValue <= max)
		{
			int value = toInt();
			for(int i = romans.length - 1; i >= 0; i--)
			{
				while(rvals[i] <= value)
				{
					tmp += romans[i];
					value -= rvals[i];
				}
			}
		}
		else
		{
			tmp += UNDEFINED;
		}
		
		return tmp;
	}
		
	public int toInt()
	{
		return integerValue;
	}
	
	// Return 1 if greater than r, 0 if equal, -1 otherwise
	public int compareTo(RomanNumeral r)
	{
		int value;
		
		if(toInt() > r.toInt())
		{
			value = 1;
		}
		else if(toInt() == r.toInt())
		{
			value = 0;
		}
		else
		{
			value = -1;
		}
		
		return value;
	}
	
	public static void main(String args[])
	{
		RomanNumeral r1 = new RomanNumeral(5);
		RomanNumeral r2 = new RomanNumeral(0);
		
		for(int i  = min - 1; i < max + 1; i++)
		{
			r2.setIntegerValue(i);
			System.out.printf("Number: %d\tObject: %d %s\tCompareTo5: %d\n",
				i, r2.toInt(), r2, r2.compareTo(r1));
		}	
	}
}
