package laboon;

public class Exercise
{
	public static long triangle(long num)
	{
		if (num <= 1) {
			return num;
		} 
		else 
		{
			return triangle(num -1) + triangle(num -2);
		}
	}
	
	public static long lazy(long num)
	{
		return ((num * num + num + 2) / 2);
	}
	
	public static void main(String[] args)
	{
		if (args.length != 2)
		{
			System.exit(1);
		}
		else if (Integer.parseInt(args[1]) <= 0)
		{
			System.out.println("The second argument is not a positive 32-bit number");
			System.exit(2);
		}
		else
		{
			if (args[0].equals("triangle"))
			{
				try
				{
					long x = triangle(Long.parseLong(args[1]));
					System.out.println("Tri(n) = " + x);
				}
				catch (NumberFormatException ex)
				{
					System.out.println("Enter an integer");
					System.exit(1);
				}
			}
			else if (args[0].equals("lazy"))
			{
				try
				{
					long x = lazy(Long.parseLong(args[1]));
					System.out.println("Lazy(n) = " + x);
				}
				
				catch (NumberFormatException ex)
				{
					System.out.println("Enter an integer");
					System.exit(1);
				}
			}
			else
			{
				System.out.println("You didn't enter lazy or triangle");
				System.exit(1);
			}
			
		}
	}
} 