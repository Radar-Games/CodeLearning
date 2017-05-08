using System;

namespace StringConversionApp
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			// Variables
			int i = 75;
			float f = 53.005f;
			double d = 2345.7652;
			bool b = true;

			// Converting Number Variables to String Variables (Implicit Conversion)
			Console.WriteLine(i.ToString());
			Console.WriteLine(f.ToString());
			Console.WriteLine(d.ToString());
			Console.WriteLine(b.ToString());
			Console.ReadKey();
		}
	}
}
