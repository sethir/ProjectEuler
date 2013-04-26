//Find the sum of all the multiples of 3 or 5 below 1000
//Tim Skew 2013-04-24

public class Problem1 
{
	public static void main (String [] args)
	{
		int totalSum = 0;
		for (int i = 1; i < 1000; i++)
		{
			if (i % 3 == 0)
			{
				totalSum += i;
			}
			else if (i % 5 == 0)
			{
				totalSum += i;
			}
		}
		System.out.println (totalSum);
	}
}