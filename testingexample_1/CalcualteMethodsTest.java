
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.EnableJUnit4MigrationSupport;


public class CalculateMethodsTest {
	private CalculateMethods calculateMethods = new CalculateMethods();

	@Test
	public void testdivide() {
		Assertions.assertequals( expected:10, calculateMethods.divide(100, 10));
		
	}

}
