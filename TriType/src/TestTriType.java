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
		assertEquals(t.Tritype(2, 3, 4), 0);
		assertEquals(t.Tritype(3, 3, 4), 1);
		assertEquals(t.Tritype(3, 3, 3), 2);
		assertEquals(t.Tritype(3, 3, -1), 3);
		assertEquals(t.Tritype(-3, 3, -1), 3);
	}
}
