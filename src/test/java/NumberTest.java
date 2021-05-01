import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

	private Number number;
	
	@Before
	public void Before() {
		
		this.number = new Number(9, 9);
		
	}
	@Test
	public void getAddition() {

		assertEquals(18, this.number.getAddition());
	}
	
	@Test
	public void getSubtraction() {

		assertEquals(0, this.number.getSubtraction());
	}
	
	@Test 
	public void getMultiplication() {
		
		assertEquals(81, this.number.getMultiplication());
	}
}
