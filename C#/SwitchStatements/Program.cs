using System;

namespace SwitchStatements
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			// Initializing Variables
			char grade = 'B';

			// Switch Statement
			switch (grade)
			{ 
				case 'A':
					Console.WriteLine("Excellent!");
					break;

				case 'B':
					Console.WriteLine('B');
					break;

				default:
					Console.WriteLine("Invalid grade");
					break;
			}
			Console.WriteLine("Your grade is {0}", grade);
			Console.ReadLine();
		}
	}
}
