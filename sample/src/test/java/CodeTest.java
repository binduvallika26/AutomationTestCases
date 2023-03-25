import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CodeTest {
	@Test
	@DisplayName("welcomeclass")
	
	//@RepeatedTest(3)
	public void testSayhello() {
		Code code= new Code();
		assertEquals("Helloworld!", code.Sayhello());
		
	}

}
