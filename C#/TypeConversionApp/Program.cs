using System;

namespace TypeConversionApp
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			// Variables
			double d = 5673.74;
			int i;

			// Conversion double to int (Explicit)
			i = (int)d;
			Console.WriteLine(i);
			Console.ReadKey();
			// If the conversion was the other 
			// way it would be an implicit conversion
		}
	}
}
