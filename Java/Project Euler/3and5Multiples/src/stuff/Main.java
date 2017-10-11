package stuff;

import java.util.stream.*;

public class Main 
{
	public static int[] numbers = new int[1000];
	
	public static int j = 0;
	
	public static void main(String[] args)
	{
		for (int i = 0; i < 1000; i++)
		{
			if (i % 3 == 0)
			{
				numbers[j] = i;
			}
			else if(i % 5 == 0)
			{
				numbers[j] = i;
			}
			
			j++;
		}
		
		int sum = IntStream.of(numbers).sum();
		
		System.out.println(sum);
	}
}
