import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestTriType {
   private TriType t;
 
	@Before
	public void setup() {
		t = new TriType();
	}
	
	@Test
	public void test() {
		assertEquals(t.Tritype(0, 0, 0), 3);
	}
}
