package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringLengthCountTest {

	@Test
	public void test() 
	{
		JunitTesting output= new JunitTesting();
		assertEquals(7,output.Count("AlFABET"));
	
	}
	
}
