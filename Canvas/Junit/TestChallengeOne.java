import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.canvas.controller.ChallengeOne;

public class TestChallengeOne {

	private ChallengeOne obj;
	@Before
	public void SetUp(){
		obj = new ChallengeOne();
		
	}
	@Test
	public void test() {
		
		assertTrue(obj.generateSeries(0, 100));
	}

}
