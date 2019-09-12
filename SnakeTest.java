import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	@Before
	public void setUp() throws Exception {
		Snake s=new Snake("Peter",10,"coffee");
		Snake s2=new Snake("Takis",80,"vegetables");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
	
	String ExpectedOutput="vegetables";
	
	assertEquals("ExpectedOutput","ActualOutput");
		
		
		
		fail("Not yet implemented");
	}

}
