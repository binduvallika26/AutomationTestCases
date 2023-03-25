import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculateMethodsTest{
	private CalculateMethods calculateMethods = new CalculateMethods();
	
	
	@Test
	public void testdivide() {
				Assertions.assertequals( expected:10, calculateMethods.divide(x:100, y:10));
		
	}
	
}