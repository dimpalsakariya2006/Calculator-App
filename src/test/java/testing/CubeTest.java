package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test() {
		JunitTesting output= new JunitTesting();
		assertEquals(125,output.Cube(5));
		
	}

}
