import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateMethodsTest {
	private CalculateMethods calculateMethods = new CalculateMethods();

	@Test
	public void testdivide() {
		assertEquals( 10, calculateMethods.divide(100, 10));
		
	}

}
