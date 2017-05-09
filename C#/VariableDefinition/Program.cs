using System;

namespace VariableDefinition
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			// Defining Variables
			short a;
			int b;
			double c;
			string d;

			// Initializing Variables
			a = 10;
			b = 20;
			c = a + b;
			d = Convert.ToString(Console.ReadLine());
			// This line reads what the user inputs converts it to 
			// a string variable which then gets saved it to the string variable d.

			// Displaying Variables
			Console.WriteLine("a = {0}, b = {1}, c = {2}, d = {3}", a, b, c, d);
			// This Write Line function uses an array 
			// to make the code easier to read
			Console.ReadLine();
		}
	}
}
