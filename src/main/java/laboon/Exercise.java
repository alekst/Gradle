package laboon;

public class Exercise
{
	public static int triangle(int num)
	{
		if (num <= 1) {
			return num;
		} 
		else 
		{
			return triangle(num - 1) + triangle(num - 2);
		}
	}