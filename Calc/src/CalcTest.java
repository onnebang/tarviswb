import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void testAdd() {
//		fail("Not yet implemented");
		assertTrue("Calc sum incorrect",5==Calc.add(2, 3));
		
	}
	
	@Test
	void testAdd2() {
//		fail("Not yet implemented");
		assertTrue("Calc sum incorrect",6==Calc.add(2, 3));
		
	}

}
