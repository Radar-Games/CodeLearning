using System;

namespace OperatorsApp1
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			// Declaring and Initalizing variables
			int a = 21;
			int b = 10;
			int c;

			// Demonstration of all Arithmetic Operators
			c = a + b; // Addition
			Console.WriteLine("Line 1 - Value of c is {0}", c);
			c = a - b; // Subtraction
			Console.WriteLine("Line 2 - Value of c is {0}", c);
			c = a * b; // Multiplication
			Console.WriteLine("Line 3 - Value of c is {0}", c);
			c = a / b; // Division
			Console.WriteLine("Line 4 - Value of c is {0}", c);
			c = a % b; // Remainder left after division
			Console.WriteLine("Line 5 - Value of c is {0}", c);
			c = a ++; // Adds one
			Console.WriteLine("Line 6 - Value of c is {0}", c);
			c = a --; // Subtracts one
			Console.WriteLine("Line 7 - Value of c is {0}", c);

			Console.ReadLine();
		}
	}
}
