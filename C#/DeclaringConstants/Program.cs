using System;

namespace DeclaringConstants
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			// Declaring and Initalizing Variables
			const double pi = 3.14159; // This line initializes a variable and declares it as a constant
			double r;

			// Getting radius of circle from user
			Console.WriteLine("Enter Radius: ");
			r = Convert.ToDouble(Console.ReadLine());

			// Calculating area and circumfrence of 2D circle
			double areaCircle = pi * r * r;
			double circCircle = 2 * pi * r;

			// Displaying Results
			Console.WriteLine("Radius: {0}, Area: {1}, Circumfrence: {2}", r, areaCircle, circCircle);
			Console.ReadLine();
		}
	}
}
