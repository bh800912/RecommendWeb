import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	 public void testSubString(){
	   String str = new String("This is a unit test.");
	   assertEquals("unit", str.substring(9, 14));
	 }	


}
