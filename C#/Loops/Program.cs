using System;

namespace Loops
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			/// While Loop

			// Variable Initalizing
			int a = 10;

			// While Loop
			while (a < 20)
			{
				Console.WriteLine("Value of 'a': {0}", a);
				a++;
			}

			Console.ReadLine();

			/// For Loop

			// For Loop Execution
			for (int b = 10; b < 20; b = b + 1)
			{
				Console.WriteLine("Value of 'b': {0}", b);
			}

			Console.ReadLine();

			/// Do While Loop

			// Variable Initialization
			int c = 10;

			// Do ... While Loop
			do
			{
				Console.WriteLine("Value of 'c': {0}", c);
				c = c + 1;
			} while (c < 20);

			Console.ReadLine();

			/// Continue

			// Initalizing Vaiables
			int d = 10;
			 
			// Do ... While Loop
			do
			{
				if (d == 15)
				{
			 		// Continue
			 		d = d + 1;
			 		continue;// This line skips the rest of the code to the end of the Do ... While statement
			 	}
				Console.WriteLine("value of 'd': {0}", d);
				d++;
			} while (d < 20); // Contine statement skips to here
			Console.ReadLine();
		}
	}
}
