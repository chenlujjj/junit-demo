/**
 * source: https://www.guru99.com/junit-exception-test.html
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArithmeticTest {

	public String message = "Saurabh";
	
	JUnitMessage junitMessage = new JUnitMessage(message);
	
	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage(){
		System.out.println("Junit Message is printing ");
		junitMessage.printMessage();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testJUnitHiMessage(){ 
		message="Hi!" + message;
		System.out.println("Junit Message is printing ");
		assertEquals(message, junitMessage.printMessage());
	}
}