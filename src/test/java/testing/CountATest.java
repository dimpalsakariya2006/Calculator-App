package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() 
		{
			JunitTesting output= new JunitTesting();
			assertEquals(7,output.CountA("Shree Swami Atmanand Saraswati Institute of Technology"));
		
	}

}
