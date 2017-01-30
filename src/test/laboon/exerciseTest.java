import org.junit.Test;
import static org.junit.Assert.*;

import laboon.Exercise;

public class ExerciseTest {
	
	@Test
	public void testExercise() 
	{
		assertEquals(Exercise.triangle(0), 0);
	}
	
	@Test
	public void testExercise1()
	{
		assertEquals(Exercise.triangle(1), 1);
	}
	
	@Test
	public void testLazy()
	{
		assertEquals(Exercise.lazy(0), 1);
	}
	
}