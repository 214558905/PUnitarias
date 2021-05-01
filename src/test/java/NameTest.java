import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class NameTest {
	
	private Name name;
	
	@Before
	public void Before() {
		
		this.name = new Name("Juan esta durmiendo");
	}

	@Test
	public void getLeght() {
		
		assertEquals(19, this.name.getLeght());
	}

}
