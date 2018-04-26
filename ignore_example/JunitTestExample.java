/**
 * source: https://www.guru99.com/junit-ignore-test.html
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;

@Ignore  // 忽略整个class的测试
public class JunitTestExample {				

    public String message = "Guru99";							

    JUnitMessage junitMessage = new JUnitMessage(message);							

    @Test
    // @Ignore  // 忽略单个测试
    // @Ignore("not yet ready , Please ignore.")  // 忽略单个测试，并给出理由
    public void testJUnitMessage() {					

        System.out.println("Junit Message is printing");					
        assertEquals(message, junitMessage.printMessage());					

    }		

    @Test		
    public void testJUnitHiMessage() {					
        message="Hi!" +message;							
        System.out.println("Junit Hi Message is printing ");					
        assertEquals(message, junitMessage.printHiMessage());					

    }		
}		