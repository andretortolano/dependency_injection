package sample.unittest;

import org.junit.Assert;
import org.junit.Test;

public class CustomMathTest {

	@Test
	public void intSum_WithPositive_WillReturnSum() {
		// Given
		CustomMath math = new CustomMath();
		int a = 2;
		int b = 2;
		// When
		int result = math.intSum(a, b);
		// Then
		Assert.assertEquals(4, result);
	}
}
